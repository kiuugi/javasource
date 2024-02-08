package inheritance;

public class DmbCellPhoneEx {

  public static void main(String[] args) {
    DmbCellPhone dmbCellPhone = new DmbCellPhone();

    dmbCellPhone.model = "쌈쏭";
    dmbCellPhone.color = "black";
    dmbCellPhone.channel = 7;

    dmbCellPhone.powerOn();
    dmbCellPhone.turnOnDmb();
    dmbCellPhone.changeChannelDmb(24);
    dmbCellPhone.turnOffDmb();
    dmbCellPhone.bell();
    dmbCellPhone.sendVoice("hello?");
    dmbCellPhone.receiveVoice("hi");
    dmbCellPhone.hangUp();
  }
}
