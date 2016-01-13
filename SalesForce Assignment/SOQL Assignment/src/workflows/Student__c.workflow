<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>Record_Update</fullName>
        <description>Record Update</description>
        <protected>false</protected>
        <recipients>
            <field>Email__c</field>
            <type>email</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>unfiled$public/Record_Update_Report</template>
    </alerts>
    <fieldUpdates>
        <fullName>Married_Status</fullName>
        <field>Married__c</field>
        <literalValue>1</literalValue>
        <name>Married Status</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <rules>
        <fullName>Married Status Update</fullName>
        <actions>
            <name>Married_Status</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <criteriaItems>
            <field>Student__c.WifeName__c</field>
            <operation>notEqual</operation>
            <value>Null</value>
        </criteriaItems>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Record Update Report</fullName>
        <actions>
            <name>Record_Update</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>ISCHANGED( First_Name__c ) || ISCHANGED(Last_Name__c) ||
ISCHANGED( AgeBox__c )  ||   ISCHANGED( Class__c ) ||  ISCHANGED( DOB__c ) ||  ISCHANGED( Email__c )  ||  ISCHANGED( Married__c )  ||  ISCHANGED( WifeName__c ) || ISCHANGED( Sex__c) || ISCHANGED(Name)</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
</Workflow>
