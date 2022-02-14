package bussinessLogic;

import java.util.List;

import persistence.DataAccessInterface;
import domain.City;
import domain.Country;

public class FacadeImpl implements FacadeInterface {
	private DataAccessInterface dataAccess;
	
	public void setDataAccess(DataAccessInterface pDataAccess){
		dataAccess=pDataAccess;
	}

	public List<String> getAllCountryNames() {
		return dataAccess.getAllCountryNames();
	}

	public List<Country> getAllCountries() {
		return dataAccess.getAllCountries();
	}

	public boolean saveCountryAndCity (String countryName, int countryPopul,String capitalName,int capitalPopul,String airportName, int foundationYear){
		return dataAccess.saveCountryAndCity(countryName,countryPopul,capitalName,capitalPopul,airportName,foundationYear);		
	}

	public boolean removeCountry (Country country){
		return dataAccess.removeCountry(country);
	}
	
	public boolean removePresidentFromCountry (Country country){
		return dataAccess.removePresidentFromCountry(country);
	}
	
	
	public void assignNeighbors (Country home, List<Country> neighbors) {
		dataAccess.assignNeighbors(home,  neighbors);
		// TODO Auto-generated method stub
		
	}

	public void changePresident (Country home, List<Country> neighbors) {
		dataAccess.assignNeighbors(home,  neighbors);
		// TODO Auto-generated method stub
		
	}
}
