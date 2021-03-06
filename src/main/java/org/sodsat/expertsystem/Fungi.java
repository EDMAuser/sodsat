package org.sodsat.expertsystem;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Fungi implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Description("Factor to compute the fungi probability")
   @org.kie.api.definition.type.Label("Air relative humidity factor")
   private java.lang.Double airRH;

   @org.kie.api.definition.type.Label("Air relative humidity values")
   private java.util.List<java.lang.Double> airRHvalues;

   @org.kie.api.definition.type.Description("Factor when computing the fungi probability")
   @org.kie.api.definition.type.Label("Air Temperature factor")
   private java.lang.Double airTemp;

   @org.kie.api.definition.type.Description("Boolean indicating if the air relative humidity field affets the fungi appearance")
   @org.kie.api.definition.type.Label("Air relative humidity (Boolean)")
   private java.lang.Boolean boolAirRH;

   @org.kie.api.definition.type.Description("Boolean indicating if the air temperature influences the computation of the fungi probability")
   @org.kie.api.definition.type.Label("Air Temperature (Boolean)")
   private java.lang.Boolean boolAirTemp;

   @org.kie.api.definition.type.Description("Boolean indicating if Azoxystrobin can be applied to treat the fungi")
   @org.kie.api.definition.type.Label("Azoxystrobin treatment applicable")
   private java.lang.Boolean boolAzoxystrobin;

   @org.kie.api.definition.type.Description("Boolean indicating if Benalaxil can be applied to treat the fungi")
   @org.kie.api.definition.type.Label("Benalaxil treatment applicable")
   private java.lang.Boolean boolBenalaxil;

   @org.kie.api.definition.type.Description("Boolean indicating if Fosetil Al can be applied to treat the fungi")
   @org.kie.api.definition.type.Label("Fosetil Al treatment applicable")
   private java.lang.Boolean boolFosetilAl;

   @org.kie.api.definition.type.Description("Boolean indicating if Iprodione can be applied to treat the fungi")
   @org.kie.api.definition.type.Label("Iprodione treatment applicable")
   private java.lang.Boolean boolIprodione;

   @org.kie.api.definition.type.Description("Boolean indicating if the leaf wetness influences the computation of the fungi probability appearance")
   @org.kie.api.definition.type.Label("Leaf wetness (Boolean)")
   private java.lang.Boolean boolLeafWetness;

   @org.kie.api.definition.type.Description("Boolean indicating if Metalaxil M can be applied to treat the fungi")
   @org.kie.api.definition.type.Label("Metalaxil M treatment applicable")
   private java.lang.Boolean boolMetalaxilM;

   @org.kie.api.definition.type.Description("Boolean indicating if Prochloraz can be applied to treat the fungi")
   @org.kie.api.definition.type.Label("Prochloraz treatment applicable")
   private java.lang.Boolean boolProchloraz;

   @org.kie.api.definition.type.Description("Boolean indicating if Prochloraz and Propiconazole can be combined to treat the fungi")
   @org.kie.api.definition.type.Label("Combined treatment of Prochloraz and Propiconazole applicable")
   private java.lang.Boolean boolProchlorazPropiconazole;

   @org.kie.api.definition.type.Description("Boolean indicating if Propamocorb can be applied to treat the fungi")
   @org.kie.api.definition.type.Label("Propamocorb treatment applicable")
   private java.lang.Boolean boolPropamocorb;

   @org.kie.api.definition.type.Description("Boolean indicating if Propiconazole can be applied to treat the fungi")
   @org.kie.api.definition.type.Label("Propiconazole treatment applicable")
   private java.lang.Boolean boolPropiconazole;

   @org.kie.api.definition.type.Description("Boolean indicating if Pyraclostrobin can be applied to treat the fungi")
   @org.kie.api.definition.type.Label("Pyraclostrobin treatment applicable")
   private java.lang.Boolean boolPyraclostrobin;

   @org.kie.api.definition.type.Description("Boolean indicating if the soil type factor influences the fungi appearance probability")
   @org.kie.api.definition.type.Label("Soil Temperature (Boolean)")
   private java.lang.Boolean boolSoilTemp;

   @org.kie.api.definition.type.Description("Boolean indicating if the soil pH factor affects the probability computation")
   @org.kie.api.definition.type.Label("Soil pH (Boolean)")
   private java.lang.Boolean boolSoilpH;

   @org.kie.api.definition.type.Description("Boolean indicating if Tebucanozole can be applied to treat the fungi")
   @org.kie.api.definition.type.Label("Tebucanozole treatment applicable")
   private java.lang.Boolean boolTebucanozole;

   @org.kie.api.definition.type.Description("Boolean indicating if Toclotos-metyl can be applied to treat the fungi")
   @org.kie.api.definition.type.Label("Toclotos-metyl treatment applicable")
   private java.lang.Boolean boolToclotosMetyl;

   @org.kie.api.definition.type.Description("Boolean indicating if Triftoxytrobin and Tebuconazole can be combined to treat the fungi")
   @org.kie.api.definition.type.Label("Combined Triftoxytrobin and Tebuconazole treatment applicable")
   private java.lang.Boolean boolTriftoxytrobinTebuconazole;

   @org.kie.api.definition.type.Description("Boolean indicating if the turfgrass species influences the fungi appearance probability")
   @org.kie.api.definition.type.Label("Turfgrass species factor (Boolean)")
   private java.lang.Boolean boolTurfgrass;

   @org.kie.api.definition.type.Label("Daytime maximal temperature")
   private java.lang.Double daytimeMaxTemp;

   @org.kie.api.definition.type.Description("Alarm launched associated to a fungi appearance (Enum)")
   @org.kie.api.definition.type.Label("Fungi alarm")
   private java.lang.String fungiAlarm;

   @org.kie.api.definition.type.Description("Fungi appearance probability ([0, .., 1])")
   @org.kie.api.definition.type.Label("Fungi probability")
   private java.lang.Double fungiProbability;

   @org.kie.api.definition.type.Description("Species of the fungi we are computing the appearance probability(enum)")
   @org.kie.api.definition.type.Label("Fungi Species")
   private java.lang.String fungiSpecies;

   @org.kie.api.definition.type.Label("Last air relative humidity value")
   private java.lang.Double lastAirRH;

   @org.kie.api.definition.type.Label("Last soil temperature")
   private java.lang.Double lastSoilTemp;

   @org.kie.api.definition.type.Description("Factor to compute the fungi appearance probability")
   @org.kie.api.definition.type.Label("Leaf wetness factor")
   private java.lang.Double leafWetness;

   @org.kie.api.definition.type.Label("Night time temperatures (list of values)")
   private java.util.List<java.lang.Double> nightTimeTempValues;

   @org.kie.api.definition.type.Label("Night time maximal temperature")
   private java.lang.Double nighttimeMaxTemp;

   @org.kie.api.definition.type.Description("Last soil pH sample")
   @org.kie.api.definition.type.Label("Last soil pH value")
   private java.lang.Double pHvalue;

   @org.kie.api.definition.type.Description("Factor to compute the fungi appearance probability")
   @org.kie.api.definition.type.Label("Soil Temperature factor")
   private java.lang.Double soilTemp;

   @org.kie.api.definition.type.Description("Factor to compute the fungi susceptability")
   @org.kie.api.definition.type.Label("Soil pH factor")
   private java.lang.Double soilpH;

   @org.kie.api.definition.type.Description("List of treatments applicable to eradicate the fungi")
   @org.kie.api.definition.type.Label("Treatments to eradicate the fungi")
   private java.util.List<org.sodsat.expertsystem.Treatment> treatments;

   @org.kie.api.definition.type.Description("Factor to compute the fungi appearance probability")
   @org.kie.api.definition.type.Label("Turfgrass species factor")
   private java.lang.Double turfgrassFactor;

   @org.kie.api.definition.type.Description("Turfgrass species for which we are computing the fungi appearance probabiliy")
   @org.kie.api.definition.type.Label("Turfgrass species (enum)")
   private java.lang.String turfgrassSpecies;

   @org.kie.api.definition.type.Label("Leaf wetness values")
   private java.util.List<java.lang.Double> leafWetnessValues;

   @org.kie.api.definition.type.Description(value = "List of leaf wetness readings in a daily basis")
   @org.kie.api.definition.type.Label(value = "Daily Leaf Wetness values")
   private java.util.List<org.sodsat.expertsystem.DailyReadings> dailyLeafWetnessReadings;

   public Fungi()
   {
   }

   public java.lang.Double getAirRH()
   {
      return this.airRH;
   }

   public void setAirRH(java.lang.Double airRH)
   {
      this.airRH = airRH;
   }

   public java.util.List<java.lang.Double> getAirRHvalues()
   {
      return this.airRHvalues;
   }

   public void setAirRHvalues(java.util.List<java.lang.Double> airRHvalues)
   {
      this.airRHvalues = airRHvalues;
   }

   public java.lang.Double getAirTemp()
   {
      return this.airTemp;
   }

   public void setAirTemp(java.lang.Double airTemp)
   {
      this.airTemp = airTemp;
   }

   public java.lang.Boolean getBoolAirRH()
   {
      return this.boolAirRH;
   }

   public void setBoolAirRH(java.lang.Boolean boolAirRH)
   {
      this.boolAirRH = boolAirRH;
   }

   public java.lang.Boolean getBoolAirTemp()
   {
      return this.boolAirTemp;
   }

   public void setBoolAirTemp(java.lang.Boolean boolAirTemp)
   {
      this.boolAirTemp = boolAirTemp;
   }

   public java.lang.Boolean getBoolAzoxystrobin()
   {
      return this.boolAzoxystrobin;
   }

   public void setBoolAzoxystrobin(java.lang.Boolean boolAzoxystrobin)
   {
      this.boolAzoxystrobin = boolAzoxystrobin;
   }

   public java.lang.Boolean getBoolBenalaxil()
   {
      return this.boolBenalaxil;
   }

   public void setBoolBenalaxil(java.lang.Boolean boolBenalaxil)
   {
      this.boolBenalaxil = boolBenalaxil;
   }

   public java.lang.Boolean getBoolFosetilAl()
   {
      return this.boolFosetilAl;
   }

   public void setBoolFosetilAl(java.lang.Boolean boolFosetilAl)
   {
      this.boolFosetilAl = boolFosetilAl;
   }

   public java.lang.Boolean getBoolIprodione()
   {
      return this.boolIprodione;
   }

   public void setBoolIprodione(java.lang.Boolean boolIprodione)
   {
      this.boolIprodione = boolIprodione;
   }

   public java.lang.Boolean getBoolLeafWetness()
   {
      return this.boolLeafWetness;
   }

   public void setBoolLeafWetness(java.lang.Boolean boolLeafWetness)
   {
      this.boolLeafWetness = boolLeafWetness;
   }

   public java.lang.Boolean getBoolMetalaxilM()
   {
      return this.boolMetalaxilM;
   }

   public void setBoolMetalaxilM(java.lang.Boolean boolMetalaxilM)
   {
      this.boolMetalaxilM = boolMetalaxilM;
   }

   public java.lang.Boolean getBoolProchloraz()
   {
      return this.boolProchloraz;
   }

   public void setBoolProchloraz(java.lang.Boolean boolProchloraz)
   {
      this.boolProchloraz = boolProchloraz;
   }

   public java.lang.Boolean getBoolProchlorazPropiconazole()
   {
      return this.boolProchlorazPropiconazole;
   }

   public void setBoolProchlorazPropiconazole(
         java.lang.Boolean boolProchlorazPropiconazole)
   {
      this.boolProchlorazPropiconazole = boolProchlorazPropiconazole;
   }

   public java.lang.Boolean getBoolPropamocorb()
   {
      return this.boolPropamocorb;
   }

   public void setBoolPropamocorb(java.lang.Boolean boolPropamocorb)
   {
      this.boolPropamocorb = boolPropamocorb;
   }

   public java.lang.Boolean getBoolPropiconazole()
   {
      return this.boolPropiconazole;
   }

   public void setBoolPropiconazole(java.lang.Boolean boolPropiconazole)
   {
      this.boolPropiconazole = boolPropiconazole;
   }

   public java.lang.Boolean getBoolPyraclostrobin()
   {
      return this.boolPyraclostrobin;
   }

   public void setBoolPyraclostrobin(java.lang.Boolean boolPyraclostrobin)
   {
      this.boolPyraclostrobin = boolPyraclostrobin;
   }

   public java.lang.Boolean getBoolSoilTemp()
   {
      return this.boolSoilTemp;
   }

   public void setBoolSoilTemp(java.lang.Boolean boolSoilTemp)
   {
      this.boolSoilTemp = boolSoilTemp;
   }

   public java.lang.Boolean getBoolSoilpH()
   {
      return this.boolSoilpH;
   }

   public void setBoolSoilpH(java.lang.Boolean boolSoilpH)
   {
      this.boolSoilpH = boolSoilpH;
   }

   public java.lang.Boolean getBoolTebucanozole()
   {
      return this.boolTebucanozole;
   }

   public void setBoolTebucanozole(java.lang.Boolean boolTebucanozole)
   {
      this.boolTebucanozole = boolTebucanozole;
   }

   public java.lang.Boolean getBoolToclotosMetyl()
   {
      return this.boolToclotosMetyl;
   }

   public void setBoolToclotosMetyl(java.lang.Boolean boolToclotosMetyl)
   {
      this.boolToclotosMetyl = boolToclotosMetyl;
   }

   public java.lang.Boolean getBoolTriftoxytrobinTebuconazole()
   {
      return this.boolTriftoxytrobinTebuconazole;
   }

   public void setBoolTriftoxytrobinTebuconazole(
         java.lang.Boolean boolTriftoxytrobinTebuconazole)
   {
      this.boolTriftoxytrobinTebuconazole = boolTriftoxytrobinTebuconazole;
   }

   public java.lang.Boolean getBoolTurfgrass()
   {
      return this.boolTurfgrass;
   }

   public void setBoolTurfgrass(java.lang.Boolean boolTurfgrass)
   {
      this.boolTurfgrass = boolTurfgrass;
   }

   public java.lang.Double getDaytimeMaxTemp()
   {
      return this.daytimeMaxTemp;
   }

   public void setDaytimeMaxTemp(java.lang.Double daytimeMaxTemp)
   {
      this.daytimeMaxTemp = daytimeMaxTemp;
   }

   public java.lang.String getFungiAlarm()
   {
      return this.fungiAlarm;
   }

   public void setFungiAlarm(java.lang.String fungiAlarm)
   {
      this.fungiAlarm = fungiAlarm;
   }

   public java.lang.Double getFungiProbability()
   {
      return this.fungiProbability;
   }

   public void setFungiProbability(java.lang.Double fungiProbability)
   {
      this.fungiProbability = fungiProbability;
   }

   public java.lang.String getFungiSpecies()
   {
      return this.fungiSpecies;
   }

   public void setFungiSpecies(java.lang.String fungiSpecies)
   {
      this.fungiSpecies = fungiSpecies;
   }

   public java.lang.Double getLastAirRH()
   {
      return this.lastAirRH;
   }

   public void setLastAirRH(java.lang.Double lastAirRH)
   {
      this.lastAirRH = lastAirRH;
   }

   public java.lang.Double getLastSoilTemp()
   {
      return this.lastSoilTemp;
   }

   public void setLastSoilTemp(java.lang.Double lastSoilTemp)
   {
      this.lastSoilTemp = lastSoilTemp;
   }

   public java.lang.Double getLeafWetness()
   {
      return this.leafWetness;
   }

   public void setLeafWetness(java.lang.Double leafWetness)
   {
      this.leafWetness = leafWetness;
   }

   public java.util.List<java.lang.Double> getLeafWetnessValues()
   {
      return this.leafWetnessValues;
   }

   public void setLeafWetnessValues(
	java.util.List<java.lang.Double> leafWetnessValues)
   {
      this.leafWetnessValues = leafWetnessValues;
   }

   public java.util.List<java.lang.Double> getNightTimeTempValues()
   {
      return this.nightTimeTempValues;
   }

   public void setNightTimeTempValues(
         java.util.List<java.lang.Double> nightTimeTempValues)
   {
      this.nightTimeTempValues = nightTimeTempValues;
   }

   public java.lang.Double getNighttimeMaxTemp()
   {
      return this.nighttimeMaxTemp;
   }

   public void setNighttimeMaxTemp(java.lang.Double nighttimeMaxTemp)
   {
      this.nighttimeMaxTemp = nighttimeMaxTemp;
   }

   public java.lang.Double getpHvalue()
   {
      return this.pHvalue;
   }

   public void setpHvalue(java.lang.Double pHvalue)
   {
      this.pHvalue = pHvalue;
   }

   public java.lang.Double getSoilTemp()
   {
      return this.soilTemp;
   }

   public void setSoilTemp(java.lang.Double soilTemp)
   {
      this.soilTemp = soilTemp;
   }

   public java.lang.Double getSoilpH()
   {
      return this.soilpH;
   }

   public void setSoilpH(java.lang.Double soilpH)
   {
      this.soilpH = soilpH;
   }

   public java.util.List<org.sodsat.expertsystem.Treatment> getTreatments()
   {
      return this.treatments;
   }

   public void setTreatments(
         java.util.List<org.sodsat.expertsystem.Treatment> treatments)
   {
      this.treatments = treatments;
   }

   public java.lang.Double getTurfgrassFactor()
   {
      return this.turfgrassFactor;
   }

   public void setTurfgrassFactor(java.lang.Double turfgrassFactor)
   {
      this.turfgrassFactor = turfgrassFactor;
   }

   public java.lang.String getTurfgrassSpecies()
   {
      return this.turfgrassSpecies;
   }

   public void setTurfgrassSpecies(java.lang.String turfgrassSpecies)
   {
      this.turfgrassSpecies = turfgrassSpecies;
   }

   public java.util.List<org.sodsat.expertsystem.DailyReadings> getDailyLeafWetnessReadings()
   {
      return this.dailyLeafWetnessReadings;
   }

   public void setDailyLeafWetnessReadings(
         java.util.List<org.sodsat.expertsystem.DailyReadings> dailyLeafWetnessReadings)
   {
      this.dailyLeafWetnessReadings = dailyLeafWetnessReadings;
   }

   public Fungi(
         java.lang.Double airRH,
         java.util.List<java.lang.Double> airRHvalues,
         java.lang.Double airTemp,
         java.lang.Boolean boolAirRH,
         java.lang.Boolean boolAirTemp,
         java.lang.Boolean boolAzoxystrobin,
         java.lang.Boolean boolBenalaxil,
         java.lang.Boolean boolFosetilAl,
         java.lang.Boolean boolIprodione,
         java.lang.Boolean boolLeafWetness,
         java.lang.Boolean boolMetalaxilM,
         java.lang.Boolean boolProchloraz,
         java.lang.Boolean boolProchlorazPropiconazole,
         java.lang.Boolean boolPropamocorb,
         java.lang.Boolean boolPropiconazole,
         java.lang.Boolean boolPyraclostrobin,
         java.lang.Boolean boolSoilTemp,
         java.lang.Boolean boolSoilpH,
         java.lang.Boolean boolTebucanozole,
         java.lang.Boolean boolToclotosMetyl,
         java.lang.Boolean boolTriftoxytrobinTebuconazole,
         java.lang.Boolean boolTurfgrass,
         java.lang.Double daytimeMaxTemp,
         java.lang.String fungiAlarm,
         java.lang.Double fungiProbability,
         java.lang.String fungiSpecies,
         java.lang.Double lastAirRH,
         java.lang.Double lastSoilTemp,
         java.lang.Double leafWetness,
         java.util.List<java.lang.Double> nightTimeTempValues,
         java.lang.Double nighttimeMaxTemp,
         java.lang.Double pHvalue,
         java.lang.Double soilTemp,
         java.lang.Double soilpH,
         java.util.List<org.sodsat.expertsystem.Treatment> treatments,
         java.lang.Double turfgrassFactor,
         java.lang.String turfgrassSpecies,
         java.util.List<java.lang.Double> leafWetnessValues,
         java.util.List<org.sodsat.expertsystem.DailyReadings> dailyLeafWetnessReadings)
   {
      this.airRH = airRH;
      this.airRHvalues = airRHvalues;
      this.airTemp = airTemp;
      this.boolAirRH = boolAirRH;
      this.boolAirTemp = boolAirTemp;
      this.boolAzoxystrobin = boolAzoxystrobin;
      this.boolBenalaxil = boolBenalaxil;
      this.boolFosetilAl = boolFosetilAl;
      this.boolIprodione = boolIprodione;
      this.boolLeafWetness = boolLeafWetness;
      this.boolMetalaxilM = boolMetalaxilM;
      this.boolProchloraz = boolProchloraz;
      this.boolProchlorazPropiconazole = boolProchlorazPropiconazole;
      this.boolPropamocorb = boolPropamocorb;
      this.boolPropiconazole = boolPropiconazole;
      this.boolPyraclostrobin = boolPyraclostrobin;
      this.boolSoilTemp = boolSoilTemp;
      this.boolSoilpH = boolSoilpH;
      this.boolTebucanozole = boolTebucanozole;
      this.boolToclotosMetyl = boolToclotosMetyl;
      this.boolTriftoxytrobinTebuconazole = boolTriftoxytrobinTebuconazole;
      this.boolTurfgrass = boolTurfgrass;
      this.daytimeMaxTemp = daytimeMaxTemp;
      this.fungiAlarm = fungiAlarm;
      this.fungiProbability = fungiProbability;
      this.fungiSpecies = fungiSpecies;
      this.lastAirRH = lastAirRH;
      this.lastSoilTemp = lastSoilTemp;
      this.leafWetness = leafWetness;
      this.nightTimeTempValues = nightTimeTempValues;
      this.nighttimeMaxTemp = nighttimeMaxTemp;
      this.pHvalue = pHvalue;
      this.soilTemp = soilTemp;
      this.soilpH = soilpH;
      this.treatments = treatments;
      this.turfgrassFactor = turfgrassFactor;
      this.turfgrassSpecies = turfgrassSpecies;
      this.leafWetnessValues = leafWetnessValues;
      this.dailyLeafWetnessReadings = dailyLeafWetnessReadings;
   }

   /*Method to initialise the list of Leaf Wetness values*/
   public void initLeafWetness()
   {
      // List of Leaf Wetness Values
      this.dailyLeafWetnessReadings = new java.util.ArrayList<org.sodsat.expertsystem.DailyReadings>();

      // DailyLeafWetness object that we will copy.
      org.sodsat.expertsystem.DailyReadings dr = new org.sodsat.expertsystem.DailyReadings();
      dr.initDailyLeafWetnessReadings();

      // Value initialisation
      this.dailyLeafWetnessReadings.add(dr); // day 1
      this.dailyLeafWetnessReadings.add(dr); // day 2
      this.dailyLeafWetnessReadings.add(dr); // day 3
      this.dailyLeafWetnessReadings.add(dr); // day 4
      this.dailyLeafWetnessReadings.add(dr); // day 5
      this.dailyLeafWetnessReadings.add(dr); // day 6
      this.dailyLeafWetnessReadings.add(dr); // day 7
      this.dailyLeafWetnessReadings.add(dr); // day 8
      this.dailyLeafWetnessReadings.add(dr); // day 9
   }
}