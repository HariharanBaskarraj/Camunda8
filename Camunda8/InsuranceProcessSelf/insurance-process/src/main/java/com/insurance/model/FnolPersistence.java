package com.insurance.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Transient;

@Entity
public class FnolPersistence {

	@Id
	@GeneratedValue(generator = "fnol_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "fnol_gen", sequenceName = "fnol_seq", initialValue = 101, allocationSize = 1)
	private Integer fnolId;
//	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private String incidentDateTime;
	private String reportingPersonFirstName;
	private String reportingPersonLastName;
	private String reportingPersonAddress;
	private String reportingPersonPhoneNumber;
	private String vehicleOwnerType;
	private String vehicleOwnerFirstName;
	private String vehicleOwnerLastName;
	private String vehicleOwnerAddress;
	private String vehicleOwnerBirthDate;
	private String vehicleOwnerPhoneNumber;
	private String policyNumber;
	private String accidentLocation;
	private String policeReport;
	private String policeReportNumber;
	private String witness;
	private String witnessName;
	private String vehicleType;
	private String accidentType;
	private String trafficCoditions;
	private String lightConditions;
	private String trafficWeather;
	private String roadwayCharacter;
	private String roadSurface;
	private String speedLimit;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "fnol_id")
	private List<EvasiveActions> evasiveActions;
	private String description;
	private String licensePlate;
	private String vehicleMake;
	private String vehicleModel;
	private String pointOfImpact;
	private String color;
	private String vehicleLocation;
	private String locationContactNumber;
	private String movePermission;
	private String driveCondition;
	//@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private String todayDate;
	@Transient
	private String acknowledgement;
	@Transient
	private String agreement;

	public FnolPersistence() {
		super();
	}

	public FnolPersistence(String incidentDateTime, String reportingPersonFirstName,
			String reportingPersonLastName, String reportingPersonAddress, String reportingPersonPhoneNumber,
			String vehicleOwnerType, String vehicleOwnerFirstName, String vehicleOwnerLastName,
			String vehicleOwnerAddress, String vehicleOwnerBirthDate, String vehicleOwnerPhoneNumber,
			String policyNumber, String accidentLocation, String policeReport, String policeReportNumber,
			String witness, String witnessName, String vehicleType, String accidentType, String trafficCoditions,
			String lightConditions, String trafficWeather, String roadwayCharacter, String roadSurface,
			String speedLimit, List<EvasiveActions> evasiveActions, String description, String licensePlate, String vehicleMake,
			String vehicleModel, String pointOfImpact, String color, String vehicleLocation,
			String locationContactNumber, String movePermission, String driveCondition, String todayDate,
			String acknowledgement, String agreement) {
		super();
		this.incidentDateTime = incidentDateTime;
		this.reportingPersonFirstName = reportingPersonFirstName;
		this.reportingPersonLastName = reportingPersonLastName;
		this.reportingPersonAddress = reportingPersonAddress;
		this.reportingPersonPhoneNumber = reportingPersonPhoneNumber;
		this.vehicleOwnerType = vehicleOwnerType;
		this.vehicleOwnerFirstName = vehicleOwnerFirstName;
		this.vehicleOwnerLastName = vehicleOwnerLastName;
		this.vehicleOwnerAddress = vehicleOwnerAddress;
		this.vehicleOwnerBirthDate = vehicleOwnerBirthDate;
		this.vehicleOwnerPhoneNumber = vehicleOwnerPhoneNumber;
		this.policyNumber = policyNumber;
		this.accidentLocation = accidentLocation;
		this.policeReport = policeReport;
		this.policeReportNumber = policeReportNumber;
		this.witness = witness;
		this.witnessName = witnessName;
		this.vehicleType = vehicleType;
		this.accidentType = accidentType;
		this.trafficCoditions = trafficCoditions;
		this.lightConditions = lightConditions;
		this.trafficWeather = trafficWeather;
		this.roadwayCharacter = roadwayCharacter;
		this.roadSurface = roadSurface;
		this.speedLimit = speedLimit;
		this.evasiveActions = evasiveActions;
		this.description = description;
		this.licensePlate = licensePlate;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.pointOfImpact = pointOfImpact;
		this.color = color;
		this.vehicleLocation = vehicleLocation;
		this.locationContactNumber = locationContactNumber;
		this.movePermission = movePermission;
		this.driveCondition = driveCondition;
		this.todayDate = todayDate;
		this.acknowledgement = acknowledgement;
		this.agreement = agreement;
	}

	public Integer getFnolId() {
		return fnolId;
	}

	public void setFnolId(Integer fnolId) {
		this.fnolId = fnolId;
	}

	public String getIncidentDateTime() {
		return incidentDateTime;
	}

	public void setIncidentDateTime(String incidentDateTime) {
		this.incidentDateTime = incidentDateTime;
	}

	public String getReportingPersonFirstName() {
		return reportingPersonFirstName;
	}

	public void setReportingPersonFirstName(String reportingPersonFirstName) {
		this.reportingPersonFirstName = reportingPersonFirstName;
	}

	public String getReportingPersonLastName() {
		return reportingPersonLastName;
	}

	public void setReportingPersonLastName(String reportingPersonLastName) {
		this.reportingPersonLastName = reportingPersonLastName;
	}

	public String getReportingPersonAddress() {
		return reportingPersonAddress;
	}

	public void setReportingPersonAddress(String reportingPersonAddress) {
		this.reportingPersonAddress = reportingPersonAddress;
	}

	public String getReportingPersonPhoneNumber() {
		return reportingPersonPhoneNumber;
	}

	public void setReportingPersonPhoneNumber(String reportingPersonPhoneNumber) {
		this.reportingPersonPhoneNumber = reportingPersonPhoneNumber;
	}

	public String getVehicleOwnerType() {
		return vehicleOwnerType;
	}

	public void setVehicleOwnerType(String vehicleOwnerType) {
		this.vehicleOwnerType = vehicleOwnerType;
	}

	public String getVehicleOwnerFirstName() {
		return vehicleOwnerFirstName;
	}

	public void setVehicleOwnerFirstName(String vehicleOwnerFirstName) {
		this.vehicleOwnerFirstName = vehicleOwnerFirstName;
	}

	public String getVehicleOwnerLastName() {
		return vehicleOwnerLastName;
	}

	public void setVehicleOwnerLastName(String vehicleOwnerLastName) {
		this.vehicleOwnerLastName = vehicleOwnerLastName;
	}

	public String getVehicleOwnerAddress() {
		return vehicleOwnerAddress;
	}

	public void setVehicleOwnerAddress(String vehicleOwnerAddress) {
		this.vehicleOwnerAddress = vehicleOwnerAddress;
	}

	public String getVehicleOwnerBirthDate() {
		return vehicleOwnerBirthDate;
	}

	public void setVehicleOwnerBirthDate(String vehicleOwnerBirthDate) {
		this.vehicleOwnerBirthDate = vehicleOwnerBirthDate;
	}

	public String getVehicleOwnerPhoneNumber() {
		return vehicleOwnerPhoneNumber;
	}

	public void setVehicleOwnerPhoneNumber(String vehicleOwnerPhoneNumber) {
		this.vehicleOwnerPhoneNumber = vehicleOwnerPhoneNumber;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getAccidentLocation() {
		return accidentLocation;
	}

	public void setAccidentLocation(String accidentLocation) {
		this.accidentLocation = accidentLocation;
	}

	public String getPoliceReport() {
		return policeReport;
	}

	public void setPoliceReport(String policeReport) {
		this.policeReport = policeReport;
	}

	public String getPoliceReportNumber() {
		return policeReportNumber;
	}

	public void setPoliceReportNumber(String policeReportNumber) {
		this.policeReportNumber = policeReportNumber;
	}

	public String getWitness() {
		return witness;
	}

	public void setWitness(String witness) {
		this.witness = witness;
	}

	public String getWitnessName() {
		return witnessName;
	}

	public void setWitnessName(String witnessName) {
		this.witnessName = witnessName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getAccidentType() {
		return accidentType;
	}

	public void setAccidentType(String accidentType) {
		this.accidentType = accidentType;
	}

	public String getTrafficCoditions() {
		return trafficCoditions;
	}

	public void setTrafficCoditions(String trafficCoditions) {
		this.trafficCoditions = trafficCoditions;
	}

	public String getLightConditions() {
		return lightConditions;
	}

	public void setLightConditions(String lightConditions) {
		this.lightConditions = lightConditions;
	}

	public String getTrafficWeather() {
		return trafficWeather;
	}

	public void setTrafficWeather(String trafficWeather) {
		this.trafficWeather = trafficWeather;
	}

	public String getRoadwayCharacter() {
		return roadwayCharacter;
	}

	public void setRoadwayCharacter(String roadwayCharacter) {
		this.roadwayCharacter = roadwayCharacter;
	}

	public String getRoadSurface() {
		return roadSurface;
	}

	public void setRoadSurface(String roadSurface) {
		this.roadSurface = roadSurface;
	}

	public String getSpeedLimit() {
		return speedLimit;
	}

	public void setSpeedLimit(String speedLimit) {
		this.speedLimit = speedLimit;
	}

	public List<EvasiveActions> getEvasiveActions() {
		return evasiveActions;
	}

	public void setEvasiveActions(List<EvasiveActions> evasiveActions) {
		this.evasiveActions = evasiveActions;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getPointOfImpact() {
		return pointOfImpact;
	}

	public void setPointOfImpact(String pointOfImpact) {
		this.pointOfImpact = pointOfImpact;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVehicleLocation() {
		return vehicleLocation;
	}

	public void setVehicleLocation(String vehicleLocation) {
		this.vehicleLocation = vehicleLocation;
	}

	public String getLocationContactNumber() {
		return locationContactNumber;
	}

	public void setLocationContactNumber(String locationContactNumber) {
		this.locationContactNumber = locationContactNumber;
	}

	public String getMovePermission() {
		return movePermission;
	}

	public void setMovePermission(String movePermission) {
		this.movePermission = movePermission;
	}

	public String getDriveCondition() {
		return driveCondition;
	}

	public void setDriveCondition(String driveCondition) {
		this.driveCondition = driveCondition;
	}

	public String getTodayDate() {
		return todayDate;
	}

	public void setTodayDate(String todayDate) {
		this.todayDate = todayDate;
	}

	public String getAcknowledgement() {
		return acknowledgement;
	}

	public void setAcknowledgement(String acknowledgement) {
		this.acknowledgement = acknowledgement;
	}

	public String getAgreement() {
		return agreement;
	}

	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}

	@Override
	public String toString() {
		return "FnolPersistence [fnolId=" + fnolId + ", incidentDateTime=" + incidentDateTime
				+ ", reportingPersonFirstName=" + reportingPersonFirstName + ", reportingPersonLastName="
				+ reportingPersonLastName + ", reportingPersonAddress=" + reportingPersonAddress
				+ ", reportingPersonPhoneNumber=" + reportingPersonPhoneNumber + ", vehicleOwnerType="
				+ vehicleOwnerType + ", vehicleOwnerFirstName=" + vehicleOwnerFirstName + ", vehicleOwnerLastName="
				+ vehicleOwnerLastName + ", vehicleOwnerAddress=" + vehicleOwnerAddress + ", vehicleOwnerBirthDate="
				+ vehicleOwnerBirthDate + ", vehicleOwnerPhoneNumber=" + vehicleOwnerPhoneNumber + ", policyNumber="
				+ policyNumber + ", accidentLocation=" + accidentLocation + ", policeReport=" + policeReport
				+ ", policeReportNumber=" + policeReportNumber + ", witness=" + witness + ", witnessName=" + witnessName
				+ ", vehicleType=" + vehicleType + ", accidentType=" + accidentType + ", trafficCoditions="
				+ trafficCoditions + ", lightConditions=" + lightConditions + ", trafficWeather=" + trafficWeather
				+ ", roadwayCharacter=" + roadwayCharacter + ", roadSurface=" + roadSurface + ", speedLimit="
				+ speedLimit + ", evasiveActions=" + evasiveActions + ", description=" + description + ", licensePlate="
				+ licensePlate + ", vehicleMake=" + vehicleMake + ", vehicleModel=" + vehicleModel + ", pointOfImpact="
				+ pointOfImpact + ", color=" + color + ", vehicleLocation=" + vehicleLocation
				+ ", locationContactNumber=" + locationContactNumber + ", movePermission=" + movePermission
				+ ", driveCondition=" + driveCondition + ", todayDate=" + todayDate + ", acknowledgement="
				+ acknowledgement + ", agreement=" + agreement + "]";
	}

}
