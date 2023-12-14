public class Boy {
    public void chatWithGirl(){
        Agreement girl = new Girl();
        girl.chat();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
    }
}
