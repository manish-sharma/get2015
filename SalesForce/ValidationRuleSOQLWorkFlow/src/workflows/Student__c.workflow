<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>Send_email_if_record_modified</fullName>
        <description>Send email if record modified</description>
        <protected>false</protected>
        <recipients>
            <type>creator</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>unfiled$public/Notify_to_student_when_his_her_account_updated</template>
    </alerts>
    <fieldUpdates>
        <fullName>Update_married</fullName>
        <field>Married__c</field>
        <literalValue>1</literalValue>
        <name>Update married</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
        <reevaluateOnChange>true</reevaluateOnChange>
    </fieldUpdates>
    <rules>
        <fullName>If wifename than married %3D true</fullName>
        <actions>
            <name>Update_married</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>NOT(ISNULL(Wife_Name__c))</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Send Email To Student</fullName>
        <actions>
            <name>Send_email_if_record_modified</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>ISCHANGED( LastModifiedDate )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
</Workflow>
