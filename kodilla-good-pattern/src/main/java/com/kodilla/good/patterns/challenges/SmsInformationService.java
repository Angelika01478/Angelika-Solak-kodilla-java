package com.kodilla.good.patterns.challenges;

public class SmsInformationService implements InformationService {


    @Override
    public void inform(User user) {
        System.out.println("The SMS with details of delivery was send to " + user.getName() + " " + user.getSurname());
    }
}
