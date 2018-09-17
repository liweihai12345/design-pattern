package pattern.mediator.demo;

public class Woman extends Person {

	public Woman(String name, int age, int requestAge,
			MarriageAgency ma) {
		super(name, age, Sex.female, requestAge, ma);
	}

}
