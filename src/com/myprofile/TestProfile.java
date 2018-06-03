package com.myprofile;

public class TestProfile {
 public static void printProfile(IProfile profile) {
	 profile.myBasicInfo();
	 profile.myHobbies();
	 
 }
	public static void main(String[] args) {
		IProfile myProfile =new KirubhaProfile();
        printProfile(myProfile);
        IProfile myProfile1 =new ViraProfile();
        printProfile(myProfile1);
        
	}

}
