package ro.ase.cts.facade.classes;

public class Facade {
	public static String verificaPacient(Pacient pacient)
	{
		Medic medic=new Medic("Ion", "cardiolog");
		
		StringBuilder sb=new StringBuilder();
		if(pacient.isStareGrava())
		{
			sb.append("Pacientul " +pacient.getNume() +" este in stare grava, trimite catre medic. ");
		}
		else
		{
			sb.append("Pacientul " +pacient.getNume() +" nu este in stare grava. ");
		}
		if(medic.esteNecesaraInternarea(pacient))
		{
			Salon salon=new Salon(20);
			sb.append(" Medicul a decis ca este necesara internarea pacientului " + pacient.getNume());
			if(salon.arePaturiLibere())
			{
				sb.append(pacient.getNume()+ " poate fi internat in salonul nostru.");
			}
			else
			{
				sb.append(pacient.getNume()+ " nu are locuri disponibile salonul nostru.");
			}
		}
		return sb.toString();
	}
}
