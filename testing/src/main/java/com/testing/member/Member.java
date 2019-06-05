package com.testing.member;

public class Member {
    public String memberName;
    public  int memberNumber;

    public Member(String memberName, int memberNumber){
        this.memberName = memberName;
        this.memberNumber = memberNumber;
    }

    public String getMemberName(){
        return memberName;
    }

    public int getMemberNumber(){
        return memberNumber;
    }
}
