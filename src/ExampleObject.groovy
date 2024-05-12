Random random = new Random()

class ExampleObjectPerson {
    String firstName
    String lastName

    ExampleObjectPerson() {
        this.firstName = 'John'
        this.lastName = 'Smith'
    }

    //Notice anything missing?
    //Both of these variables will have automatically generated getters and setters, because they are public properties


    //And here's a surprise tool, object overloading
    ExampleObjectPerson plus(ExampleObjectPerson other){
        //Lists are literally java array lists
        //this is dynamically typed as a list of our unique object
        def list = [this, other]
        def child = new ExampleObjectPerson()
        if (Math.random() < 0.5) {
            child.setFirstName("${this.getFirstName()}-${other.getFirstName()}")
            child.setLastName("${this.getLastName()}")
        }
        else{
            child.setFirstName("${other.getFirstName()}-${this.getFirstName()}")
            child.setLastName(other.getLastName())
        }
        return child
    }

    //And one more example, of both operator overloading AND of an optional return
    String multiply(ExampleObjectPerson other){
        String doesntThisNeedtoBeAReturnStatement = "${this.getFirstName()}*${other.getFirstName()} " +
                                                    "and ${this.getLastName()}*${other.getLastName()}"
    }
}
