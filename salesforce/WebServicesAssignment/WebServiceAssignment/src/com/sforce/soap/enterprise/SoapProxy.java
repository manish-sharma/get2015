package com.sforce.soap.enterprise;

public class SoapProxy implements com.sforce.soap.enterprise.Soap {
  private String _endpoint = null;
  private com.sforce.soap.enterprise.Soap soap = null;
  
  public SoapProxy() {
    _initSoapProxy();
  }
  
  public SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSoapProxy();
  }
  
  private void _initSoapProxy() {
    try {
      soap = (new com.sforce.soap.enterprise.SforceServiceLocator()).getSoap();
      if (soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (soap != null)
      ((javax.xml.rpc.Stub)soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sforce.soap.enterprise.Soap getSoap() {
    if (soap == null)
      _initSoapProxy();
    return soap;
  }
  
  public com.sforce.soap.enterprise.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.LoginFault{
    if (soap == null)
      _initSoapProxy();
    return soap.login(username, password);
  }
  
  public com.sforce.soap.enterprise.DescribeSObjectResult describeSObject(java.lang.String sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSObject(sObjectType);
  }
  
  public com.sforce.soap.enterprise.DescribeSObjectResult[] describeSObjects(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSObjects(sObjectType);
  }
  
  public com.sforce.soap.enterprise.DescribeGlobalResult describeGlobal() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeGlobal();
  }
  
  public com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeDataCategoryGroups(sObjectType);
  }
  
  public com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[] pairs, boolean topCategoriesOnly) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeDataCategoryGroupStructures(pairs, topCategoriesOnly);
  }
  
  public com.sforce.soap.enterprise.KnowledgeSettings describeKnowledgeSettings() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeKnowledgeSettings();
  }
  
  public com.sforce.soap.enterprise.DescribeFlexiPageResult[] describeFlexiPages(java.lang.String[] flexiPages, com.sforce.soap.enterprise.FlexipageContext[] contexts) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeFlexiPages(flexiPages, contexts);
  }
  
  public com.sforce.soap.enterprise.DescribeAppMenuItem[] describeAppMenu(com.sforce.soap.enterprise.AppMenuType appMenuType, java.lang.String networkId) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeAppMenu(appMenuType, networkId);
  }
  
  public com.sforce.soap.enterprise.DescribeGlobalTheme describeGlobalTheme() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeGlobalTheme();
  }
  
  public com.sforce.soap.enterprise.DescribeThemeItem[] describeTheme(java.lang.String[] sobjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeTheme(sobjectType);
  }
  
  public com.sforce.soap.enterprise.DescribeLayoutResult describeLayout(java.lang.String sObjectType, java.lang.String layoutName, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeLayout(sObjectType, layoutName, recordTypeIds);
  }
  
  public com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult describeSoftphoneLayout() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSoftphoneLayout();
  }
  
  public com.sforce.soap.enterprise.DescribeSearchLayoutResult[] describeSearchLayouts(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSearchLayouts(sObjectType);
  }
  
  public com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[] describeSearchScopeOrder() throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSearchScopeOrder();
  }
  
  public com.sforce.soap.enterprise.DescribeCompactLayoutsResult describeCompactLayouts(java.lang.String sObjectType, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeCompactLayouts(sObjectType, recordTypeIds);
  }
  
  public com.sforce.soap.enterprise.DescribePathAssistant[] describePathAssistants(java.lang.String sObjectType, java.lang.String picklistValue, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describePathAssistants(sObjectType, picklistValue, recordTypeIds);
  }
  
  public com.sforce.soap.enterprise.DescribeApprovalLayout[] describeApprovalLayout(java.lang.String sObjectType, java.lang.String[] approvalProcessNames) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeApprovalLayout(sObjectType, approvalProcessNames);
  }
  
  public com.sforce.soap.enterprise.DescribeSoqlListView[] describeSoqlListViews(com.sforce.soap.enterprise.DescribeSoqlListViewParams[] request) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSoqlListViews(request);
  }
  
  public com.sforce.soap.enterprise.ExecuteListViewResult executeListView(com.sforce.soap.enterprise.ExecuteListViewRequest request) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.executeListView(request);
  }
  
  public com.sforce.soap.enterprise.DescribeSoqlListView[] describeSObjectListViews(java.lang.String sObjectType, boolean recentsOnly, com.sforce.soap.enterprise.ListViewIsSoqlCompatible isSoqlCompatible, int limit, int offset) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeSObjectListViews(sObjectType, recentsOnly, isSoqlCompatible, limit, offset);
  }
  
  public com.sforce.soap.enterprise.DescribeTabSetResult[] describeTabs() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeTabs();
  }
  
  public com.sforce.soap.enterprise.DescribeTab[] describeAllTabs() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.describeAllTabs();
  }
  
  public com.sforce.soap.enterprise.DescribeCompactLayout[] describePrimaryCompactLayouts(java.lang.String[] sObjectTypes) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describePrimaryCompactLayouts(sObjectTypes);
  }
  
  public com.sforce.soap.enterprise.SaveResult[] create(com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.create(sObjects);
  }
  
  public com.sforce.soap.enterprise.SaveResult[] update(com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.update(sObjects);
  }
  
  public com.sforce.soap.enterprise.UpsertResult[] upsert(java.lang.String externalIDFieldName, com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.upsert(externalIDFieldName, sObjects);
  }
  
  public com.sforce.soap.enterprise.MergeResult[] merge(com.sforce.soap.enterprise.MergeRequest[] request) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.merge(request);
  }
  
  public com.sforce.soap.enterprise.DeleteResult[] delete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.delete(ids);
  }
  
  public com.sforce.soap.enterprise.UndeleteResult[] undelete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.undelete(ids);
  }
  
  public com.sforce.soap.enterprise.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.emptyRecycleBin(ids);
  }
  
  public com.sforce.soap.enterprise.sobject.SObject[] retrieve(java.lang.String fieldList, java.lang.String sObjectType, java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.retrieve(fieldList, sObjectType, ids);
  }
  
  public com.sforce.soap.enterprise.ProcessResult[] process(com.sforce.soap.enterprise.ProcessRequest[] actions) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.process(actions);
  }
  
  public com.sforce.soap.enterprise.LeadConvertResult[] convertLead(com.sforce.soap.enterprise.LeadConvert[] leadConverts) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.convertLead(leadConverts);
  }
  
  public void logout() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    soap.logout();
  }
  
  public com.sforce.soap.enterprise.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] sessionIds) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.invalidateSessions(sessionIds);
  }
  
  public com.sforce.soap.enterprise.GetDeletedResult getDeleted(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.getDeleted(sObjectType, startDate, endDate);
  }
  
  public com.sforce.soap.enterprise.GetUpdatedResult getUpdated(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.getUpdated(sObjectType, startDate, endDate);
  }
  
  public com.sforce.soap.enterprise.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.query(queryString);
  }
  
  public com.sforce.soap.enterprise.QueryResult queryAll(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.queryAll(queryString);
  }
  
  public com.sforce.soap.enterprise.QueryResult queryMore(java.lang.String queryLocator) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.queryMore(queryLocator);
  }
  
  public com.sforce.soap.enterprise.SearchResult search(java.lang.String searchString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedSearchFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.search(searchString);
  }
  
  public com.sforce.soap.enterprise.GetServerTimestampResult getServerTimestamp() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.getServerTimestamp();
  }
  
  public com.sforce.soap.enterprise.SetPasswordResult setPassword(java.lang.String userId, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidNewPasswordFault{
    if (soap == null)
      _initSoapProxy();
    return soap.setPassword(userId, password);
  }
  
  public com.sforce.soap.enterprise.ResetPasswordResult resetPassword(java.lang.String userId) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.resetPassword(userId);
  }
  
  public com.sforce.soap.enterprise.GetUserInfoResult getUserInfo() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.getUserInfo();
  }
  
  public com.sforce.soap.enterprise.SendEmailResult[] sendEmailMessage(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.sendEmailMessage(ids);
  }
  
  public com.sforce.soap.enterprise.SendEmailResult[] sendEmail(com.sforce.soap.enterprise.Email[] messages) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.sendEmail(messages);
  }
  
  public com.sforce.soap.enterprise.RenderEmailTemplateResult[] renderEmailTemplate(com.sforce.soap.enterprise.RenderEmailTemplateRequest[] renderRequests) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault{
    if (soap == null)
      _initSoapProxy();
    return soap.renderEmailTemplate(renderRequests);
  }
  
  public com.sforce.soap.enterprise.PerformQuickActionResult[] performQuickActions(com.sforce.soap.enterprise.PerformQuickActionRequest[] quickActions) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.performQuickActions(quickActions);
  }
  
  public com.sforce.soap.enterprise.DescribeQuickActionResult[] describeQuickActions(java.lang.String[] quickActions) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeQuickActions(quickActions);
  }
  
  public com.sforce.soap.enterprise.DescribeAvailableQuickActionResult[] describeAvailableQuickActions(java.lang.String contextType) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeAvailableQuickActions(contextType);
  }
  
  public com.sforce.soap.enterprise.QuickActionTemplateResult[] retrieveQuickActionTemplates(java.lang.String[] quickActionNames, java.lang.String contextId) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.retrieveQuickActionTemplates(quickActionNames, contextId);
  }
  
  public com.sforce.soap.enterprise.DescribeNounResult[] describeNouns(java.lang.String[] nouns, boolean onlyRenamed, boolean includeFields) throws java.rmi.RemoteException{
    if (soap == null)
      _initSoapProxy();
    return soap.describeNouns(nouns, onlyRenamed, includeFields);
  }
  
  
}