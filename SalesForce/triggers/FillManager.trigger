trigger FillManager on Opportunity (before update) {
    FillManager.fillManager(Trigger.new);	
}