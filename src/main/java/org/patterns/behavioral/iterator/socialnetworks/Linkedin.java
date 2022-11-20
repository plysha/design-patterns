package org.patterns.behavioral.iterator.socialnetworks;

import org.patterns.behavioral.iterator.iterators.LinkedInIterator;
import org.patterns.behavioral.iterator.iterators.ProfileIterator;
import org.patterns.behavioral.iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class Linkedin implements SocialNetwork {
    private List<Profile> contacts;

    public Linkedin(List<Profile> cache) {
        if (cache != null) {
            this.contacts = cache;
        } else {
            this.contacts = new ArrayList<>();
        }
    }

    public Profile requestContactInfoFromLinkedIn(String profileEmail) {
        // Здесь бы был POST запрос к одному из адресов API LinkedIn. Но вместо
        // этого мы эмулируем долгое сетевое соединение, прямо как в реальной
        // жизни...
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading profile '" + profileEmail + "' over the network...");

        // ...и возвращаем тестовые данные.
        return findContact(profileEmail);
    }

    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType) {
        // Здесь бы был POST запрос к одному из адресов API LinkedIn. Но вместо
        // этого мы эмулируем долгое сетевое соединение, прямо как в реальной
        // жизни...
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        // ...и возвращаем тестовые данные.
        Profile profile = findContact(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private Profile findContact(String profileEmail) {
        for (Profile profile : contacts) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }


    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, profileEmail,"friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, profileEmail, "coworkers");
    }
}
