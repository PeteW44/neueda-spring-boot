/*
 * Class:           BuildingService.java
 * Project:         Largest Buildings Demo
 * Package:         ac.uk.belfastmet.buildings.domain
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the BuildingService Class
 */

package ac.uk.belfastmet.buildings.service;
// Import Packages
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.buildings.domain.Building;

@Service
public class BuildingService 
{
	// Instance Variables
	private ArrayList<Building> areaBuildings;
	private ArrayList<Building> footBuildings;
	private ArrayList<Building> volumeBuildings;
	
	// Default Constructor
	public BuildingService() 
	{
		super();
	}
	
	// ##########
	// FLOOR AREA
	// ##########
	public ArrayList<Building> getLargestFloorArea()
	{
		// Local Variables
		ArrayList<Building> areaBuildings = new ArrayList<Building>();
		
		// Building Image Files
		final String build01 = "images/Buildings/NewCenturyGlobalCenter.jpg";
		final String build02 = "images/Buildings/DubaiInternationalAirportTerminal3.jpg";
		final String build03 = "images/Buildings/AbrajAl-BaitEndowment.jpg";
		final String build04 = "images/Buildings/CentralWorld.jpg";
		final String build05 = "images/Buildings/AalsmeerFlowerAuction.jpg";
		final String build06 = "images/Buildings/BeijingCapitalInternationalAirportTerminal3.jpg";
		final String build07 = "images/Buildings/TheVenetianMacao.jpg";
		final String build08 = "images/Buildings/SandsCotaiCentral.jpg";
		final String build09 = "images/Buildings/CiputraWorldSurabaya.jpg";
		final String build10 = "images/Buildings/BerjayaTimesSquare.jpg";
				
		// Create The Buildings
		Building building01 = new Building("New Century Global Center", "China", "Chengdu", "1,760,000 m2", "N/A", build01);
		Building building02 = new Building("Dubai International Airport Terminal 3", "United Arab Emirates", "Dubai", "1,713,000 m2", "N/A", build02);
		Building building03 = new Building("Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", "1,575,815 m2", "N/A", build03);
		Building building04 = new Building("CentralWorld", "Thailand", "Bangkok", "1,024,000 m2", "N/A", build04);
		Building building05 = new Building("Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "990,000 m2", "N/A", build05);
		Building building06 = new Building("Beijing Capital International Airport Terminal 3", "China", "Beijing", "986,000 m2", "N/A", build06);
		Building building07 = new Building("The Venetian Macao", "Macau", "Macau", "980,000 m2", "N/A", build07);
		Building building08 = new Building("Sands Cotai Central", "Macau", "Macau", "890,000 m2", "N/A", build08);
		Building building09 = new Building("Ciputra World Surabaya", "Indonesia", "Surabaya", "750,000 m2", "N/A", build09);
		Building building10 = new Building("Berjaya Times Square", "Malaysia", "Kuala Lumpur", "700,000 m2", "N/A", build10);
		
		// Add The Buildings To ArrayList
		areaBuildings.add(building01);
		areaBuildings.add(building02);
		areaBuildings.add(building03);
		areaBuildings.add(building04);
		areaBuildings.add(building05);
		areaBuildings.add(building06);
		areaBuildings.add(building07);
		areaBuildings.add(building08);
		areaBuildings.add(building09);
		areaBuildings.add(building10);

		return areaBuildings;
	}
	
	// #########
	// FOOTPRINT
	// #########
	public ArrayList<Building> getLargestFootprint()
	{
		// Local Variables
		ArrayList<Building> footBuildings = new ArrayList<Building>();
		
		// Building Image Files
		final String build01 = "images/Buildings/AalsmeerFlowerAuction.jpg";
		final String build02 = "images/Buildings/TeslaFactory.jpg";
		final String build03 = "images/Buildings/BoeingEverettFactory.jpg";
		final String build04 = "images/Buildings/MichelinDistributionCenter.jpg";
		final String build05 = "images/Buildings/GreatMosqueOfMecca.jpg";
		final String build06 = "images/Buildings/NikeNorthAmericaLogisticsCenter.jpg";
		final String build07 = "images/Buildings/JohnDeereNorthAmericanPartsDistributionCenter.jpg";
		final String build08 = "images/Buildings/MallOfDubai.jpg";
		final String build09 = "images/Buildings/MitsubishiMotorsNorthAmerica.jpg";
		final String build10 = "images/Buildings/IndonesiaConventionExhibition.jpg";
				
		// Create The Buildings
		Building building01 = new Building("Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "518,000 m2", "N/A", build01);
		Building building02 = new Building("Tesla Factory", "United States", "Fremont, California", "427,354 m2", "N/A", build02);
		Building building03 = new Building("Boeing Everett Factory", "United States", "Everett, Washington", "398,000 m2", "N/A", build03);
		Building building04 = new Building("Michelin Distribution Center", "United States", "Spartanburg, South Carolina", "371,612 m2", "N/A", build04);
		Building building05 = new Building("Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", "356,000  m2", "N/A", build05);
		Building building06 = new Building("Nike - North America Logistics Center", "United States", "Memphis, Tennessee", "260,000 m2", "N/A", build06);
		Building building07 = new Building("John Deere North American Parts Distribution Center", "United States", "Milan, Illinois", "246,000 m2", "N/A", build07);
		Building building08 = new Building("Mall of Dubai", "United Arab Emirates", "Dubai", "500,000 m2", "N/A", build08);	
		Building building09 = new Building("Mitsubishi Motors North America", "United States", "Normal, Illinois", "220,000 m2", "N/A", build09);
		Building building10 = new Building("Indonesia Convention Exhibition", "Indonesia", "Bumi Serpong Damai", "220,000 m2", "N/A", build10);
		
		// Add The Buildings To ArrayList
		footBuildings.add(building01);
		footBuildings.add(building02);
		footBuildings.add(building03);
		footBuildings.add(building04);
		footBuildings.add(building05);
		footBuildings.add(building06);
		footBuildings.add(building07);
		footBuildings.add(building08);
		footBuildings.add(building09);
		footBuildings.add(building10);

		return footBuildings;
	}
		
	// ######
	// VOLUME
	// ######
	public ArrayList<Building> getBuildingsLargestVolume()
	{
		// Local Variables
		ArrayList<Building> volumeBuildings = new ArrayList<Building>();
		
		// Building Image Files
		final String build01 = "images/Buildings/BoeingEverettFactory.jpg";
		final String build02 = "images/Buildings/GreatMosqueOfMecca.jpg";
		final String build03 = "images/Buildings/Jean-LucLagarderePlant.jpg";
		final String build04 = "images/Buildings/BoeingCompositeWingCenter.jpg";
		final String build05 = "images/Buildings/Aerium.jpg";
		final String build06 = "images/Buildings/MeyerWerftDockhalle2.jpg";
		final String build07 = "images/Buildings/NASAVehicleAssemblyBuilding.jpg";
		final String build08 = "images/Buildings/TheO2.jpg";
		final String build09 = "images/Buildings/TescoIrelandDistributionCentre.jpg";
		final String build10 = "images/Buildings/TargetImportWarehouse.jpg";
				
		// Create The Buildings
		Building building01 = new Building("Boeing Everett Factory", "United States", "Everett, Washington", "398,000 m2", "13.3 million m3", build01);
		Building building02 = new Building("Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", "356,000  m2", "8  million m3", build02);
		Building building03 = new Building("Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac", "122,500  m2", "5.6 million m3", build03);
		Building building04 = new Building("Boeing Composite Wing Center", "United States", "Everett, Washington", "111,500 m2", "3.7 million m3", build04);
		Building building05 = new Building("Aerium", "Germany", "Halbe, Brandenburg", "70,000 m2", "5.2 million m3", build05);
		Building building06 = new Building("Meyer Werft Dockhalle 2", "Germany", "Papenburg, Niedersachsen", "63,000 m2", "4.72 million m3", build06);
		Building building07 = new Building("NASA Vehicle Assembly Building", "United States", "Brevard County, Florida", "232,374 m2", "3.66 million m3", build07);
		Building building08 = new Building("The O2", "United Kingdom", "London", "104,634 m2", "2.79 million m3", build08);
		Building building09 = new Building("Tesco Ireland Distribution Centre", "Ireland", "Donabate, Fingal", "80,194 m2", "1.55 million m3", build09);
		Building building10 = new Building("Target Import Warehouse", "United States", "Savannah, Georgia", "187,664 m2", "1.5 million m3", build10);
		
		// Add The Buildings To ArrayList
		volumeBuildings.add(building01);
		volumeBuildings.add(building02);
		volumeBuildings.add(building03);
		volumeBuildings.add(building04);
		volumeBuildings.add(building05);
		volumeBuildings.add(building06);
		volumeBuildings.add(building07);
		volumeBuildings.add(building08);
		volumeBuildings.add(building09);
		volumeBuildings.add(building10);

		return volumeBuildings;
	}
}