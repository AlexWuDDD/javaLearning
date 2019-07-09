package v1ch03;

public class Constants
{
    public static void main(String[] args)
    {
        final double CM_PER_INCN = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: "
            + paperWidth * CM_PER_INCN + " by "
                + paperHeight * CM_PER_INCN);
    }

}