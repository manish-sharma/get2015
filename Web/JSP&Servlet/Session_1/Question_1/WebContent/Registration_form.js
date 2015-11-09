
var states = new Array();

states['Select State'] = new Array('Please select a State');
states['Rajasthan'] = new Array('Bikaner','Jaisalmer','Jodhpur','Udaipur',' Ajmer','Jaipur','Kota');
states['Madhya Pradesh'] = new Array('Indore',' Gwalior',' Jabalpur','Ujjain',' Sagar');
states['Uttar Pradesh'] = new Array('Noida', 'Varanasi', 'Allahabad', 'Agra' ,'Kanpur');
states['Maharashtra'] = new Array('Pune', 'Nagpur', 'Nashik', 'Aurangabad' ,'Solapur');



function setStates() {
  cntrySel = document.getElementById('State');
  stateList = states[cntrySel.value];
  changeSelect('City', stateList);
  
}




function changeSelect(fieldID, newOptions) {
  selectField = document.getElementById(fieldID);
  selectField.options.length = 0;
  for (i=0; i<newOptions.length; i++) {
    selectField.options[selectField.length] = new Option(newOptions[i]);
  }
}

