//**********************************************************************************
//  SolveTowers.java        Author: Lewis/Loftus
//
//  Demonstrates recursion
//**********************************************************************************
public class SolveTowers
{
    //------------------------------------------------------------------------------
    //  Creates a Tower of Hanoi problem and solves it.
    //------------------------------------------------------------------------------
    public static void main(String[] args)
    {
        TowersOfHanoi towers = new TowersOfHanoi(4);

        towers.solve();
    }
}
