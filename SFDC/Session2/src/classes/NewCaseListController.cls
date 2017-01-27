public class NewCaseListController {
    public LIST<Case> getNewCases()
    {
        List<Case> newCases = Database.query(
            'SELECT Id, CaseNumber '+
            'FROM Case  where Status= \'new\'');
        return newCases;
    }
}