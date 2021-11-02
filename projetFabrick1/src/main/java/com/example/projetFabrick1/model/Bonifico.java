package com.example.projetFabrick1.model;


import javax.persistence.*;

@Entity
public class Bonifico {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String receiverName;
    private String description;
    private String currency;
    private String amount;
    private String executionDate;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "compte_id", nullable = false, foreignKey = @ForeignKey(name = "fk_compte_id"))
    private Compte compte;


   public Bonifico(){

   }


/**
 * @param receiverName
 * @param description
 * @param currency
 * @param amount
 * @param executionDate
 * @param compte
 */
public Bonifico(String receiverName, String description, String currency, String amount, String executionDate,
		Compte compte) {
	super();
	this.receiverName = receiverName;
	this.description = description;
	this.currency = currency;
	this.amount = amount;
	this.executionDate = executionDate;
	this.compte = compte;
}


public String getReceiverName() {
	return receiverName;
}


public void setReceiverName(String receiverName) {
	this.receiverName = receiverName;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getCurrency() {
	return currency;
}


public void setCurrency(String currency) {
	this.currency = currency;
}


public String getAmount() {
	return amount;
}


public void setAmount(String amount) {
	this.amount = amount;
}


public String getExecutionDate() {
	return executionDate;
}


public void setExecutionDate(String executionDate) {
	this.executionDate = executionDate;
}


public Compte getCompte() {
	return compte;
}


public void setCompte(Compte compte) {
	this.compte = compte;
}


@Override
public String toString() {
	return "Bonifico [receiverName=" + receiverName + ", description=" + description + ", currency=" + currency
			+ ", amount=" + amount + ", executionDate=" + executionDate + ", compte=" + compte + "]";
}

}
