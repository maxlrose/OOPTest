package OOPTest.Interfaces;

public interface IAircraft extends IMovable {
    //protected final static int qq = 1; // error
    default IEngine.IAdditionalDevice defMethGas() {
        System.out.println("IAircraft::gas");
        IEngine.IAdditionalDevice i = null;
        return i;
    }
}

