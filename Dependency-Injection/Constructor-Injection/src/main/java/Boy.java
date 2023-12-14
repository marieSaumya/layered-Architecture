public class Boy {
    Agreement agreement;
    public Boy(Agreement agreement){
        this.agreement = agreement;
    }
    public void chatWithGirl(){

        agreement.chat();
    }

    public static void main(String[] args) {
        Boy boy = new Boy(new Girl());
        boy.chatWithGirl();
    }
}
