public class Form {
	private String name, rno;
	private int math, java, dbms, python, dcn;

	public Form() {
		super();
	}

	public Form(String name, String rno, int math, int java, int dbms, int python, int dcn) {
		super();
		this.name = name;
		this.rno = rno;
		this.math = math;
		this.java = java;
		this.dbms = dbms;
		this.python = python;
		this.dcn = dcn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDbms() {
		return dbms;
	}

	public void setDbms(int dbms) {
		this.dbms = dbms;
	}

	public int getPython() {
		return python;
	}

	public void setPython(int python) {
		this.python = python;
	}

	public int getDcn() {
		return dcn;
	}

	public void setDcn(int dcn) {
		this.dcn = dcn;
	}
}
