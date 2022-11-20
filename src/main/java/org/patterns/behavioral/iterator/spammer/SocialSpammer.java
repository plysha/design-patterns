package org.patterns.behavioral.iterator.spammer;

import org.patterns.behavioral.iterator.iterators.ProfileIterator;
import org.patterns.behavioral.iterator.profile.Profile;
import org.patterns.behavioral.iterator.socialnetworks.SocialNetwork;

public class SocialSpammer {
    private SocialNetwork socialNetwork;
    private ProfileIterator profileIterator;

    public SocialSpammer(SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("\nIterating over friends...\n");
        profileIterator = socialNetwork.createFriendsIterator(profileEmail);

        while (profileIterator.hasNext()) {
            Profile profile = profileIterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
     }

     public void sendSpamToCoworkers(String profileEmail, String message) {
         System.out.println("\nIterating over coworkers...\n");
         profileIterator = socialNetwork.createCoworkersIterator(profileEmail);
         while (profileIterator.hasNext()) {
             Profile profile = profileIterator.getNext();
             sendMessage(profile.getEmail(), message);
         }
    }

    private void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}
