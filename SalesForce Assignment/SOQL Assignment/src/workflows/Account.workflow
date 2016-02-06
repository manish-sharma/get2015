<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>Account_Update</fullName>
        <description>Account Update</description>
        <protected>false</protected>
        <recipients>
            <type>accountOwner</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>unfiled$public/Account_Record_Update</template>
    </alerts>
    <fieldUpdates>
        <fullName>Initial_Step</fullName>
        <field>Type</field>
        <literalValue>Pending</literalValue>
        <name>Initial Step</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Rejection_Request</fullName>
        <field>Type</field>
        <literalValue>Prospect</literalValue>
        <name>Rejection Request</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Step_2</fullName>
        <field>Type</field>
        <literalValue>Customer</literalValue>
        <name>Step 2</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Type_Update</fullName>
        <field>Type</field>
        <literalValue>Pending</literalValue>
        <name>Type Update</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <rules>
        <fullName>Account Update</fullName>
        <actions>
            <name>Account_Update</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>(OwnerId&lt;&gt; $Profile.LastModifiedById) &amp;&amp; (AnnualRevenue &gt; 1000000)</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
</Workflow>
