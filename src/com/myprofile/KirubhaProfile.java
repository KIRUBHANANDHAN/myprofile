package com.myprofile;
public class KirubhaProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+" vira");
		System.out.println(ProfileConstants.LAST_NAME+" nandhu" );
		System.out.println(ProfileConstants.AGE+" 21" );
	}

	@Override
	public void myHobbies() {
		System.out.println("surfing");
		
	}
	

}
