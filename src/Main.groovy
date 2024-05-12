

static void main(String[] args) {
    println "Hello world!"
    println("Hello world!") // are two completely equivalent statements

    //Like in Java, we can expressly declare a new object
    ExampleObjectPerson FrankStella = new ExampleObjectPerson()
    //We can access it's variables like so
    println FrankStella.firstName
    //Although we should probably use a get/set instead
    //What do we mean we didn't make any?
    FrankStella.setFirstName('Frank')
    FrankStella.setLastName('Stella')
    //Works just fine
    println FrankStella.getFirstName()

    //or

    //Def let's us offload the type until runtime
    def RobertRauschenberg = new ExampleObjectPerson()
    RobertRauschenberg.setFirstName('Robert')
    RobertRauschenberg.setLastName('Rauschenberg')
    RobertRauschenberg.getFirstName()

    //Interpolation, instead of needing to put a "blah" + variable + "blah", the function can be called midline
    println("Hello, ${FrankStella.getFirstName()}")

    //Now let's demonstrate how, unlike Java, we can overload this object
    ExampleObjectPerson plussed = FrankStella+RobertRauschenberg
    println("${plussed.getFirstName()} ${plussed.getLastName()}")

    //Now, we've made * work with an optional return value
    println(FrankStella*RobertRauschenberg)

}