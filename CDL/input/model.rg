@File(Name="/usr/opt/file", Delimiter=",", Context="MyContext")

model Person{
	@Column(Number=1)
	int ID;
	@Column(Number=2)
	int expense;
	@Column(Number=3)
	float height;
	@Column(Number=4)
	int age;
	@Column(Number=5)
	String name;
	@Column(Number=6)
	String sex;
}