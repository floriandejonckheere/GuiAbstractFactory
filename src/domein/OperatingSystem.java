package domein;

import domein.mac.MacFactory;
import domein.win.WinFactory;

public class OperatingSystem {

    public static Screen createScreen(String type) {
        switch (type.toLowerCase()) {
            case "win":
                return new Screen(new WinFactory());
            case "mac":
                return new Screen(new MacFactory());
        }
        return null;
    }
}
