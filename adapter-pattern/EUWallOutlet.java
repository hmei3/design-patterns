public class EUWallOutlet implements WallOutlet<EUPlug> {
  
  public void connect(EUPlug plug) {
    plug.charge();
  }
}
