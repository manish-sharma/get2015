<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>update notification</fullName>
        <protected>false</protected>
        <recipients>
            <field>email__c</field>
            <type>email</type>
        </recipients>
        <template>unfiled$public/update_notification</template>
    </alerts>
    <fieldUpdates>
        <fullName>married status</fullName>
        <field>Married__c</field>
        <literalValue>1</literalValue>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <rules>
        <fullName>married status</fullName>
        <actions>
            <name>married status</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <criteriaItems>
            <field>Student__c.WifeName__c</field>
            <operation>notEqual</operation>
            <value>null</value>
        </criteriaItems>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>update</fullName>
        <actions>
            <name>update notification</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>ISCHANGED( LastModifiedDate )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
</Workflow>
