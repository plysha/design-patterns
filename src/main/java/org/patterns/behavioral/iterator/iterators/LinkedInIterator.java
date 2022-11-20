package org.patterns.behavioral.iterator.iterators;

import org.patterns.behavioral.iterator.profile.Profile;
import org.patterns.behavioral.iterator.socialnetworks.Linkedin;

import java.util.ArrayList;
import java.util.List;

public class LinkedInIterator implements ProfileIterator {
    private Linkedin linkedin;
    private String email;
    private String type;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> contacts = new ArrayList<>();

    public LinkedInIterator(Linkedin linkedin, String email, String type) {
        this.linkedin = linkedin;
        this.email = email;
        this.type = type;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = linkedin.requestRelatedContactsFromLinkedInAPI(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.contacts.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendContact = contacts.get(currentPosition);
        if (friendContact == null) {
            friendContact = linkedin.requestContactInfoFromLinkedIn(friendEmail);
            contacts.set(currentPosition, friendContact);
        }
        currentPosition++;
        return friendContact;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
