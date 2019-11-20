package com.learn.general;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CustomerNotificationCode {
	  private static final String Template_CD="Template";
	  private static final String EmailVendor="EmailVendor";

	public static void main(String[] args) {

		Payment pay = buildPaymentObj();
		String key = (buildKey(pay));
		System.out.println("Key from Payment : "+key);
		String eVendor = getValFromCustomMapForKey(key,EmailVendor);
		System.out.println("EmailVendor : " + eVendor);
		System.out.println(getValFromCustomMapForKey(key,eVendor,Template_CD));
	}

	public static String buildKey(Payment payment) {
		System.out.println("(+) CustomerNotificationActivity :: buildKey");
		StringBuilder sb = new StringBuilder();
		if (payment != null) {
			if (payment.getTransactionTypCd() != null) {
				sb.append(payment.getTransactionTypCd());
				sb.append("_");
			}
			if (payment.getPaymentScheduleCd() != null) {
				sb.append(payment.getPaymentScheduleCd());
				sb.append("_");
			}
			if (payment.getPaymentStatusCd() != null) {
				sb.append(translateAndSetTxStatus((payment.getPaymentStatusCd())));
			}
		}
		System.out.println("Key : "+sb.toString());
		System.out.println("(-) CustomerNotificationActivity :: buildKey");
		return sb.toString();
	}
	
	/**
	 * Param one is original Key, Param two is Varargs, to build search key for NotificationVendor/Template Code
	 * @param key
	 * @param str
	 * @return 
	 */
	public static String getValFromCustomMapForKey(String key, String...str) {
		StringBuilder sb = new StringBuilder(key);
		for(String s : str) {
			sb.append("_");
			sb.append(s);
		}
		System.out.println("formed key "+sb.toString());
		String searchKey = sb.toString();
		
		Map<String, String> customMap = new HashMap<String, String>();
		customMap.put("Payment_OneTime_Success_EmailVendor", "NFS1");
		customMap.put("Payment_OneTime_failure_EmailVendor", "NFS2");
		customMap.put("Payment_scheduled_Success_EmailVendor", "NFS3");
		customMap.put("Payment_scheduled_failure_EmailVendor", "NFS4");
		customMap.put("Refund_OneTime_Success_EmailVendor", "NFS5");
		customMap.put("Refund_OneTime_failure_EmailVendor", "NFS6");
		customMap.put("Refund_Scheduled_Success_EmailVendor", "NFS7");
		customMap.put("Refund_scheduled_failure_EmailVendor", "NFS8");

		customMap.put("Payment_OneTime_Success_NFS1_Template", "Ecom.Payment.Confirmation1");
		customMap.put("Payment_OneTime_failure_NFS2_Template", "Ecom.Payment.Confirmation2");
		customMap.put("Payment_OneTime_Success_NFS3_Template", "Ecom.Payment.Confirmation3");
		customMap.put("Payment_OneTime_Success_NFS4_Template", "Ecom.Payment.Confirmation4");
		customMap.put("Refund_OneTime_Success_NFS5_Template", "Ecom.Payment.Confirmation5");
		customMap.put("Payment_Scheduled_Success_NFS6_Template", "Ecom.Payment.Confirmation6");
		customMap.put("Refund_Scheduled_Success_NFS7_Template", "Ecom.Payment.Confirmation7");
		customMap.put("Payment_OneTime_Success_NFS8_Template", "Ecom.Payment.Confirmation8");
		if (searchKey != null) {
			if (!customMap.isEmpty()) {
				if (customMap.keySet().contains(searchKey)) {
					return customMap.get(searchKey);
				}
			}
		}
		return null;
	}

	private static String translateAndSetTxStatus(String s) {
		Map<String, String> hMap = new HashMap<>();
		hMap.put("Denied","Failure");
		hMap.put("Posting_Pending","Failure");
		hMap.put("Session_Initiated","Success");
		hMap.put("Posting_Error","Failure");
		hMap.put("Session_Error","Failure");
		hMap.put("ManualReviewComplete","Failure");
		hMap.put("Capture_Error","Failure");
		hMap.put("Posting_Requested","Success");
		hMap.put("Split_Payment","Success");
		hMap.put("UnIdentified_OFFSET","Success");
		hMap.put("Cancelled","Success");
		hMap.put("Session_InProgress","Success");
		hMap.put("Void_Error","Failure");
		hMap.put("Pending_Correction","Success");
		hMap.put("Settlement_Completed","Success");
		hMap.put("Posted","Success");
		hMap.put("Session_Expired","Failure");
		hMap.put("Session_Canceled","Cancel");
		hMap.put("UnIdentified","Success");
		hMap.put("Capture_Ready","Success");
		hMap.put("Canceled","Canceled");
		hMap.put("Session_Completed","Success");
		hMap.put("Approved","Success");

		if (s != null) {
			if (hMap.containsKey(s)) {
				return hMap.get(s);
			}
		}
		return null;
	}

	private static Payment buildPaymentObj() {
		Payment p = new Payment();
		p.setTransactionTypCd("Refund");
		p.setPaymentScheduleCd("Scheduled");
		p.setPaymentStatusCd("Settlement_Completed");
		return p;
	}

}

class Payment {

	private Long paymentId;
	private String secCd;
	private String initiatingIp;
	private String vendorCustomerTypeCd;
	private String consentMediumCd;
	private String inputChannelCd;
	private String payerFirstName;
	private String payerLastName;
	private String maskedPaymentAcctNo;
	private Double convenienceFeeAmt;
	private Double totalTaxAmt;
	private Double paymentAmt;
	private Date paymentProcDt;
	private Long sourceSysTransactionId;
	private Long associatedPaymentId;
	private String transactionTypCd;
	private String paymentMethodCd;
	private String refundRequestReasonCd;
	private String billingApplicationAccntId;
	private String cardLevelVal;
	private String paymentProcessMethodCd;
	private String emailAdrs;
	private String walletReferenceVal;
	private String vendorCustomerId;
	private String businessNm;
	private String firstNm;
	private String lastNm;
	private String orderNo;
	private Long serialNo; // SERIAL_NO
	private String paymentTypeCd; // Payment_TYPE_CD
	private String billingApplicationCd; // BILLING_APPLICATION_CD
	private String cardTypeCd; // CARD_TYPE_CD
	private String destApplicationCd; // DESTINATION_APPLICATION_CD
	private String createdApplicationCd; // CREATED_APPLICATION_CD
	private String lastModApplicationCd; // LAST_MODIFIED_APPLICATION_CD
	private String paymentStatusCd; // Payment_STATUS_CD
	private String sourceApplicationCd; // SOURCE_APPLICATION_CD
	private String paymentScheduleCd; // Payment_SCHEDULE_CD
	private String customerTypeCd; // CUSTOMER_TYPE_CD
	private String statusReasonCd; // Refund_REJECT_REASON_CD
	private String projectCd; // PROJECT_CD
	private String tarCd;
	private String acctRegionTypeCd; // REGION_CD
	private String taxExemptCd; // TAX_EXEMPT_CD
	private String achAllowedInd; // ACH_ALLOWED_IND
	private String bankAcctTypeCd; // BANK_ACCOUNT_TYPE_CD
	private String cardAllowedInd;
	private String walletTypeCd;
	private String paymentVerificationRefVal;
	private String paymentInstrumentRefVal;
	private String vendorCd; // VENDOR_CD
	private String vendorPaymentId; // VENDOR_Payment_ID
	private Long checkNo; // CHECK_NO
	private String comboAcctInd; // COMBO_ACCT_ID
	private String bankAcctNum;
	private String bankRoutingCd;
	private Date paymentCreateDt;
	private String restoralInd; // RESTORAL_IND
	private String createdUserNm;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getSecCd() {
		return secCd;
	}

	public void setSecCd(String secCd) {
		this.secCd = secCd;
	}

	public String getInitiatingIp() {
		return initiatingIp;
	}

	public void setInitiatingIp(String initiatingIp) {
		this.initiatingIp = initiatingIp;
	}

	public String getVendorCustomerTypeCd() {
		return vendorCustomerTypeCd;
	}

	public void setVendorCustomerTypeCd(String vendorCustomerTypeCd) {
		this.vendorCustomerTypeCd = vendorCustomerTypeCd;
	}

	public String getConsentMediumCd() {
		return consentMediumCd;
	}

	public void setConsentMediumCd(String consentMediumCd) {
		this.consentMediumCd = consentMediumCd;
	}

	public String getInputChannelCd() {
		return inputChannelCd;
	}

	public void setInputChannelCd(String inputChannelCd) {
		this.inputChannelCd = inputChannelCd;
	}

	public String getPayerFirstName() {
		return payerFirstName;
	}

	public void setPayerFirstName(String payerFirstName) {
		this.payerFirstName = payerFirstName;
	}

	public String getPayerLastName() {
		return payerLastName;
	}

	public void setPayerLastName(String payerLastName) {
		this.payerLastName = payerLastName;
	}

	public String getMaskedPaymentAcctNo() {
		return maskedPaymentAcctNo;
	}

	public void setMaskedPaymentAcctNo(String maskedPaymentAcctNo) {
		this.maskedPaymentAcctNo = maskedPaymentAcctNo;
	}

	public Double getConvenienceFeeAmt() {
		return convenienceFeeAmt;
	}

	public void setConvenienceFeeAmt(Double convenienceFeeAmt) {
		this.convenienceFeeAmt = convenienceFeeAmt;
	}

	public Double getTotalTaxAmt() {
		return totalTaxAmt;
	}

	public void setTotalTaxAmt(Double totalTaxAmt) {
		this.totalTaxAmt = totalTaxAmt;
	}

	public Double getPaymentAmt() {
		return paymentAmt;
	}

	public void setPaymentAmt(Double paymentAmt) {
		this.paymentAmt = paymentAmt;
	}

	public Date getPaymentProcDt() {
		return paymentProcDt;
	}

	public void setPaymentProcDt(Date paymentProcDt) {
		this.paymentProcDt = paymentProcDt;
	}

	public Long getSourceSysTransactionId() {
		return sourceSysTransactionId;
	}

	public void setSourceSysTransactionId(Long sourceSysTransactionId) {
		this.sourceSysTransactionId = sourceSysTransactionId;
	}

	public Long getAssociatedPaymentId() {
		return associatedPaymentId;
	}

	public void setAssociatedPaymentId(Long associatedPaymentId) {
		this.associatedPaymentId = associatedPaymentId;
	}

	public String getTransactionTypCd() {
		return transactionTypCd;
	}

	public void setTransactionTypCd(String transactionTypCd) {
		this.transactionTypCd = transactionTypCd;
	}

	public String getPaymentMethodCd() {
		return paymentMethodCd;
	}

	public void setPaymentMethodCd(String paymentMethodCd) {
		this.paymentMethodCd = paymentMethodCd;
	}

	public String getRefundRequestReasonCd() {
		return refundRequestReasonCd;
	}

	public void setRefundRequestReasonCd(String refundRequestReasonCd) {
		this.refundRequestReasonCd = refundRequestReasonCd;
	}

	public String getBillingApplicationAccntId() {
		return billingApplicationAccntId;
	}

	public void setBillingApplicationAccntId(String billingApplicationAccntId) {
		this.billingApplicationAccntId = billingApplicationAccntId;
	}

	public String getCardLevelVal() {
		return cardLevelVal;
	}

	public void setCardLevelVal(String cardLevelVal) {
		this.cardLevelVal = cardLevelVal;
	}

	public String getPaymentProcessMethodCd() {
		return paymentProcessMethodCd;
	}

	public void setPaymentProcessMethodCd(String paymentProcessMethodCd) {
		this.paymentProcessMethodCd = paymentProcessMethodCd;
	}

	public String getEmailAdrs() {
		return emailAdrs;
	}

	public void setEmailAdrs(String emailAdrs) {
		this.emailAdrs = emailAdrs;
	}

	public String getWalletReferenceVal() {
		return walletReferenceVal;
	}

	public void setWalletReferenceVal(String walletReferenceVal) {
		this.walletReferenceVal = walletReferenceVal;
	}

	public String getVendorCustomerId() {
		return vendorCustomerId;
	}

	public void setVendorCustomerId(String vendorCustomerId) {
		this.vendorCustomerId = vendorCustomerId;
	}

	public String getBusinessNm() {
		return businessNm;
	}

	public void setBusinessNm(String businessNm) {
		this.businessNm = businessNm;
	}

	public String getFirstNm() {
		return firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getLastNm() {
		return lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}

	public String getPaymentTypeCd() {
		return paymentTypeCd;
	}

	public void setPaymentTypeCd(String paymentTypeCd) {
		this.paymentTypeCd = paymentTypeCd;
	}

	public String getBillingApplicationCd() {
		return billingApplicationCd;
	}

	public void setBillingApplicationCd(String billingApplicationCd) {
		this.billingApplicationCd = billingApplicationCd;
	}

	public String getCardTypeCd() {
		return cardTypeCd;
	}

	public void setCardTypeCd(String cardTypeCd) {
		this.cardTypeCd = cardTypeCd;
	}

	public String getDestApplicationCd() {
		return destApplicationCd;
	}

	public void setDestApplicationCd(String destApplicationCd) {
		this.destApplicationCd = destApplicationCd;
	}

	public String getCreatedApplicationCd() {
		return createdApplicationCd;
	}

	public void setCreatedApplicationCd(String createdApplicationCd) {
		this.createdApplicationCd = createdApplicationCd;
	}

	public String getLastModApplicationCd() {
		return lastModApplicationCd;
	}

	public void setLastModApplicationCd(String lastModApplicationCd) {
		this.lastModApplicationCd = lastModApplicationCd;
	}

	public String getPaymentStatusCd() {
		return paymentStatusCd;
	}

	public void setPaymentStatusCd(String paymentStatusCd) {
		this.paymentStatusCd = paymentStatusCd;
	}

	public String getSourceApplicationCd() {
		return sourceApplicationCd;
	}

	public void setSourceApplicationCd(String sourceApplicationCd) {
		this.sourceApplicationCd = sourceApplicationCd;
	}

	public String getPaymentScheduleCd() {
		return paymentScheduleCd;
	}

	public void setPaymentScheduleCd(String paymentScheduleCd) {
		this.paymentScheduleCd = paymentScheduleCd;
	}

	public String getCustomerTypeCd() {
		return customerTypeCd;
	}

	public void setCustomerTypeCd(String customerTypeCd) {
		this.customerTypeCd = customerTypeCd;
	}

	public String getStatusReasonCd() {
		return statusReasonCd;
	}

	public void setStatusReasonCd(String statusReasonCd) {
		this.statusReasonCd = statusReasonCd;
	}

	public String getProjectCd() {
		return projectCd;
	}

	public void setProjectCd(String projectCd) {
		this.projectCd = projectCd;
	}

	public String getTarCd() {
		return tarCd;
	}

	public void setTarCd(String tarCd) {
		this.tarCd = tarCd;
	}

	public String getAcctRegionTypeCd() {
		return acctRegionTypeCd;
	}

	public void setAcctRegionTypeCd(String acctRegionTypeCd) {
		this.acctRegionTypeCd = acctRegionTypeCd;
	}

	public String getTaxExemptCd() {
		return taxExemptCd;
	}

	public void setTaxExemptCd(String taxExemptCd) {
		this.taxExemptCd = taxExemptCd;
	}

	public String getAchAllowedInd() {
		return achAllowedInd;
	}

	public void setAchAllowedInd(String achAllowedInd) {
		this.achAllowedInd = achAllowedInd;
	}

	public String getBankAcctTypeCd() {
		return bankAcctTypeCd;
	}

	public void setBankAcctTypeCd(String bankAcctTypeCd) {
		this.bankAcctTypeCd = bankAcctTypeCd;
	}

	public String getCardAllowedInd() {
		return cardAllowedInd;
	}

	public void setCardAllowedInd(String cardAllowedInd) {
		this.cardAllowedInd = cardAllowedInd;
	}

	public String getWalletTypeCd() {
		return walletTypeCd;
	}

	public void setWalletTypeCd(String walletTypeCd) {
		this.walletTypeCd = walletTypeCd;
	}

	public String getPaymentVerificationRefVal() {
		return paymentVerificationRefVal;
	}

	public void setPaymentVerificationRefVal(String paymentVerificationRefVal) {
		this.paymentVerificationRefVal = paymentVerificationRefVal;
	}

	public String getPaymentInstrumentRefVal() {
		return paymentInstrumentRefVal;
	}

	public void setPaymentInstrumentRefVal(String paymentInstrumentRefVal) {
		this.paymentInstrumentRefVal = paymentInstrumentRefVal;
	}

	public String getVendorCd() {
		return vendorCd;
	}

	public void setVendorCd(String vendorCd) {
		this.vendorCd = vendorCd;
	}

	public String getVendorPaymentId() {
		return vendorPaymentId;
	}

	public void setVendorPaymentId(String vendorPaymentId) {
		this.vendorPaymentId = vendorPaymentId;
	}

	public Long getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(Long checkNo) {
		this.checkNo = checkNo;
	}

	public String getComboAcctInd() {
		return comboAcctInd;
	}

	public void setComboAcctInd(String comboAcctInd) {
		this.comboAcctInd = comboAcctInd;
	}

	public String getBankAcctNum() {
		return bankAcctNum;
	}

	public void setBankAcctNum(String bankAcctNum) {
		this.bankAcctNum = bankAcctNum;
	}

	public String getBankRoutingCd() {
		return bankRoutingCd;
	}

	public void setBankRoutingCd(String bankRoutingCd) {
		this.bankRoutingCd = bankRoutingCd;
	}

	public Date getPaymentCreateDt() {
		return paymentCreateDt;
	}

	public void setPaymentCreateDt(Date paymentCreateDt) {
		this.paymentCreateDt = paymentCreateDt;
	}

	public String getRestoralInd() {
		return restoralInd;
	}

	public void setRestoralInd(String restoralInd) {
		this.restoralInd = restoralInd;
	}

	public String getCreatedUserNm() {
		return createdUserNm;
	}

	public void setCreatedUserNm(String createdUserNm) {
		this.createdUserNm = createdUserNm;
	}
}
