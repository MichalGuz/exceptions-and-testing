package com.testing.member;

public class TestingMember {
    public static void main(String[] args) {
        Member member = new Member("Mysterious member.member", 999);

        String checkName = member.getMemberName();
        int checknumber = member.getMemberNumber();

        if (checkName.equals("Mysterious member.member") && checknumber==999){
            System.out.println("test OK");
        } else {
            System.out.println("error!");
        }
    }
}
