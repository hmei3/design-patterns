public class USPlugAdapter extends EUPlug {
  private USPlug plug;

  public USPlugAdapter(USPlug plug) {
    this.plug = plug;
  }

  @Override
  public void charge() {
    plug.charge();
  }
}




