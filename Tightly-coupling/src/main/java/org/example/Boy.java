package org.example;

public class Boy {
    public void chatWithGirl(){
        Girl girl = new Girl();
        girl.chat();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
    }
}
