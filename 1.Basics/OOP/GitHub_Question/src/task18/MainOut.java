package task18;

import task18.PackOne.PlayerBenfit;

public class MainOut extends PlayerBenfit {

    public void playerTest() {
      //  System.out.println(allBenfitPlayer); // ✅ not visible
    }

    public void captainTest() {
      //  System.out.println(allBenfitCaptain); // ✅ not visible even if I created another class that extends the CaptainBenfits
    }

    }