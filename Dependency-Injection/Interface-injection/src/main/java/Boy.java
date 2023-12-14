public class Boy implements Chat {
    Agreement agreement ;
    public void chatWithGirl(){

        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatting(new Girl());
        boy.chatWithGirl();
    }

    @Override
    public void chatting(Agreement agreement) {
        this.agreement =agreement;
    }
}
