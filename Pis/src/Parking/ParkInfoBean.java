package Parking;

public class ParkInfoBean {

	private int parking_code;// 주차장코드
	private String parking_name;// 주차장이름
	private String addr;// 주소
	private String parking_type_nm;// 주차장 종류
	private String operation_rule_nm;// 운영구분
	private String tel;// 전화번호
	private int capacity2;// 주차가능대수
	private String pay_nm;// 유료무료 구분명
	private String weekday_begin_time;// 평일운영시작시각
	private String weekday_end_time;// 평일운영종료시각
	private String weekend_begin_time;// 주말운영시작시각
	private String weekend_end_time;// 주말운영종료시각
	private String saturday_pay_nnm;// 주말유,무료 구분
	private String holiday_pay_nm;// 공휴일 유,무료 구분
	private int fulltime_monthly;// 월 정기권 금액
	private int rates;// 기본료
	private int time_rate;// 기본부과시간
	private int add_rates;// 추가부과요금
	private int add_time_rate;// 추가부과시간
	private int day_maximum;// 일 최대 요금

	public int getParking_code() {
		return parking_code;
	}

	public void setParking_code(int parking_code) {
		this.parking_code = parking_code;
	}

	public String getParking_name() {
		return parking_name;
	}

	public void setParking_name(String parking_name) {
		this.parking_name = parking_name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getParking_type_nm() {
		return parking_type_nm;
	}

	public void setParking_type_nm(String parking_type_nm) {
		this.parking_type_nm = parking_type_nm;
	}

	public String getOperation_rule_nm() {
		return operation_rule_nm;
	}

	public void setOperation_rule_nm(String operation_rule_nm) {
		this.operation_rule_nm = operation_rule_nm;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getCapacity2() {
		return capacity2;
	}

	public void setCapacity2(int capacity2) {
		this.capacity2 = capacity2;
	}

	public String getPay_nm() {
		return pay_nm;
	}

	public void setPay_nm(String pay_nm) {
		this.pay_nm = pay_nm;
	}

	public String getWeekday_begin_time() {
		return weekday_begin_time;
	}

	public void setWeekday_begin_time(String weekday_begin_time) {
		this.weekday_begin_time = weekday_begin_time;
	}

	public String getWeekday_end_time() {
		return weekday_end_time;
	}

	public void setWeekday_end_time(String weekday_end_time) {
		this.weekday_end_time = weekday_end_time;
	}

	public String getWeekend_begin_time() {
		return weekend_begin_time;
	}

	public void setWeekend_begin_time(String weekend_begin_time) {
		this.weekend_begin_time = weekend_begin_time;
	}

	public String getWeekend_end_time() {
		return weekend_end_time;
	}

	public void setWeekend_end_time(String weekend_end_time) {
		this.weekend_end_time = weekend_end_time;
	}

	public String getSaturday_pay_nnm() {
		return saturday_pay_nnm;
	}

	public void setSaturday_pay_nnm(String saturday_pay_nnm) {
		this.saturday_pay_nnm = saturday_pay_nnm;
	}

	public String getHoliday_pay_nm() {
		return holiday_pay_nm;
	}

	public void setHoliday_pay_nm(String holiday_pay_nm) {
		this.holiday_pay_nm = holiday_pay_nm;
	}

	public int getFulltime_monthly() {
		return fulltime_monthly;
	}

	public void setFulltime_monthly(int fulltime_monthly) {
		this.fulltime_monthly = fulltime_monthly;
	}

	public int getRates() {
		return rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}

	public int getTime_rate() {
		return time_rate;
	}

	public void setTime_rate(int time_rate) {
		this.time_rate = time_rate;
	}

	public int getAdd_rates() {
		return add_rates;
	}

	public void setAdd_rates(int add_rates) {
		this.add_rates = add_rates;
	}

	public int getAdd_time_rate() {
		return add_time_rate;
	}

	public void setAdd_time_rate(int add_time_rate) {
		this.add_time_rate = add_time_rate;
	}

	public int getDay_maximum() {
		return day_maximum;
	}

	public void setDay_maximum(int day_maximum) {
		this.day_maximum = day_maximum;
	}

}
