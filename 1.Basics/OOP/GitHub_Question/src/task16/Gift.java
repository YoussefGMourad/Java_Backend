package task16;

public class Gift {

    private final String giftName;

    private final String giftType;


    public Gift(String giftName, String giftType) {
        this.giftName = giftName;
        this.giftType = giftType;
    }

    public String getGiftName() {
        return giftName;
    }

    public String getGiftType() {
        return giftType;
    }

    public void showGiftData(){
        System.out.println(giftName);
        System.out.println(giftType);
    }
}