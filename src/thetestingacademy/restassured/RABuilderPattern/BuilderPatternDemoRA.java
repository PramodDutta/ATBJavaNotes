package thetestingacademy.restassured.RABuilderPattern;

public class BuilderPatternDemoRA {

    // Change return type of each method as Class type
    // "this" always points to current/calling object. Returning the same to
    // have same reference
    public BuilderPatternDemoRA Stag1()
    {
        System.out.println("Stag 1");
        return this;
    }

    public BuilderPatternDemoRA Stag2(String str)
    {
        System.out.println("Stag 2 String is "+str);
        return this;
    }

    public BuilderPatternDemoRA Stag3()
    {
        System.out.println("Stag 3");
        return this;
    }

    public static void main(String[] args) {

        BuilderPatternDemoRA builderPatternDemoRA = new BuilderPatternDemoRA();
        builderPatternDemoRA.Stag1().Stag2("Pramod").Stag3();
    }
}
