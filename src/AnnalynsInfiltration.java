class AnnalynsInfiltration {
    public static boolean canFastAttack() {
        boolean knightIsAwake = true;
        return !knightIsAwake;
    }
    public static boolean canSpy() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
    public static boolean canSignalPrisoner() {
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        return !archerIsAwake && prisonerIsAwake;
    }
    public static boolean canFreePrisoner(boolean knightIsAwake,
                                          boolean archerIsAwake,
                                          boolean prisonerIsAwake,
                                          boolean petDogIsPresent) {
            return (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
}
