package ro.ase.cts.readere;

public abstract class AplicantReader {
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	
	
}
