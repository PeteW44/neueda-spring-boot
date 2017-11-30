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

import ac.uk.belfastmet.buildings.domain.AreaBuilding;
import ac.uk.belfastmet.buildings.domain.FootBuilding;
import ac.uk.belfastmet.buildings.domain.VolumeBuilding;

@Service
public class BuildingService 
{
	// Instance Variables
	private ArrayList<AreaBuilding> areaBuildings;
	private ArrayList<FootBuilding> footBuildings;
	private ArrayList<VolumeBuilding> volumeBuildings;
	
	// Default Constructor
	public BuildingService() 
	{
		super();
	}
	
	// ##########
	// FLOOR AREA
	// ##########
	public ArrayList<AreaBuilding> getByFloorArea()
	{
		// Local Variables
		ArrayList<AreaBuilding> areaBuildings = new ArrayList<AreaBuilding>();
		
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
		AreaBuilding building01 = new AreaBuilding("New Century Global Center", "China", "Chengdu", "1,760,000 m2", build01);
		AreaBuilding building02 = new AreaBuilding("Dubai International Airport Terminal 3", "United Arab Emirates", "Dubai", "1,713,000 m2", build02);
		AreaBuilding building03 = new AreaBuilding("Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", "1,575,815 m2", build03);
		AreaBuilding building04 = new AreaBuilding("CentralWorld", "Thailand", "Bangkok", "1,024,000 m2", build04);
		AreaBuilding building05 = new AreaBuilding("Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "990,000 m2", build05);
		AreaBuilding building06 = new AreaBuilding("Beijing Capital International Airport Terminal 3", "China", "Beijing", "986,000 m2", build06);
		AreaBuilding building07 = new AreaBuilding("The Venetian Macao", "Macau", "Macau", "980,000 m2", build07);
		AreaBuilding building08 = new AreaBuilding("Sands Cotai Central", "Macau", "Macau", "890,000 m2", build08);
		AreaBuilding building09 = new AreaBuilding("Ciputra World Surabaya", "Indonesia", "Surabaya", "750,000 m2", build09);
		AreaBuilding building10 = new AreaBuilding("Berjaya Times Square", "Malaysia", "Kuala Lumpur", "700,000 m2",  build10);
		
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
	public ArrayList<FootBuilding> getByFootprint()
	{
		// Local Variables
		ArrayList<FootBuilding> footBuildings = new ArrayList<FootBuilding>();
		
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
		FootBuilding building01 = new FootBuilding("Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "518,000 m2", build01);
		FootBuilding building02 = new FootBuilding("Tesla Factory", "United States", "Fremont, California", "427,354 m2", build02);
		FootBuilding building03 = new FootBuilding("Boeing Everett Factory", "United States", "Everett, Washington", "398,000 m2", build03);
		FootBuilding building04 = new FootBuilding("Michelin Distribution Center", "United States", "Spartanburg, South Carolina", "371,612 m2", build04);
		FootBuilding building05 = new FootBuilding("Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", "356,000  m2", build05);
		FootBuilding building06 = new FootBuilding("Nike - North America Logistics Center", "United States", "Memphis, Tennessee", "260,000 m2", build06);
		FootBuilding building07 = new FootBuilding("John Deere North American Parts Distribution Center", "United States", "Milan, Illinois", "246,000 m2", build07);
		FootBuilding building08 = new FootBuilding("Mall of Dubai", "United Arab Emirates", "Dubai", "500,000 m2", build08);	
		FootBuilding building09 = new FootBuilding("Mitsubishi Motors North America", "United States", "Normal, Illinois", "220,000 m2", build09);
		FootBuilding building10 = new FootBuilding("Indonesia Convention Exhibition", "Indonesia", "Bumi Serpong Damai", "220,000 m2", build10);
		
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
	public ArrayList<VolumeBuilding> getByVolume()
	{
		// Local Variables
		ArrayList<VolumeBuilding> volumeBuildings = new ArrayList<VolumeBuilding>();
		
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
		VolumeBuilding building01 = new VolumeBuilding("Boeing Everett Factory", "United States", "Everett, Washington", "13.3 million m3", build01);
		VolumeBuilding building02 = new VolumeBuilding("Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", "8  million m3", build02);
		VolumeBuilding building03 = new VolumeBuilding("Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac", "5.6 million m3", build03);
		VolumeBuilding building04 = new VolumeBuilding("Boeing Composite Wing Center", "United States", "Everett, Washington", "3.7 million m3", build04);
		VolumeBuilding building05 = new VolumeBuilding("Aerium", "Germany", "Halbe, Brandenburg", "5.2 million m3", build05);
		VolumeBuilding building06 = new VolumeBuilding("Meyer Werft Dockhalle 2", "Germany", "Papenburg, Niedersachsen", "4.72 million m3", build06);
		VolumeBuilding building07 = new VolumeBuilding("NASA Vehicle Assembly Building", "United States", "Brevard County, Florida",  "3.66 million m3", build07);
		VolumeBuilding building08 = new VolumeBuilding("The O2", "United Kingdom", "London", "2.79 million m3", build08);
		VolumeBuilding building09 = new VolumeBuilding("Tesco Ireland Distribution Centre", "Ireland", "Donabate, Fingal", "1.55 million m3", build09);
		VolumeBuilding building10 = new VolumeBuilding("Target Import Warehouse", "United States", "Savannah, Georgia", "1.5 million m3", build10);
		
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