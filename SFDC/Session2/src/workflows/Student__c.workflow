<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>After_Student_record_updated</fullName>
        <description>After Student record updated</description>
        <protected>false</protected>
        <recipients>
            <field>Email__c</field>
            <type>email</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>unfiled$public/Record_Updation_Alert</template>
    </alerts>
    <alerts>
        <fullName>Record_updation_alert</fullName>
        <description>Record updation alert</description>
        <protected>false</protected>
        <recipients>
            <field>Email__c</field>
            <type>email</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>unfiled$public/Approve_Opportunity_Discount</template>
    </alerts>
    <fieldUpdates>
        <fullName>Mark_Married</fullName>
        <field>Married__c</field>
        <literalValue>1</literalValue>
        <name>Mark Married</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
        <reevaluateOnChange>true</reevaluateOnChange>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>iuoguig</fullName>
        <field>Married__c</field>
        <literalValue>0</literalValue>
        <name>iuoguig</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <rules>
        <fullName>Wife  name exist than married automatic true</fullName>
        <actions>
            <name>Mark_Married</name>
            <type>FieldUpdate</type>
        </actions>
        <actions>
            <name>iuoguig</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>NOT ISBLANK(Wife_Name__c)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>email after student record update</fullName>
        <actions>
            <name>After_Student_record_updated</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>ISCHANGED(  LastModifiedDate )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
</Workflow>
