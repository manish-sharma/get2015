<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>annualrevenue</fullName>
        <protected>false</protected>
        <recipients>
            <type>accountOwner</type>
        </recipients>
        <template>unfiled$public/annualrevenue</template>
    </alerts>
    <fieldUpdates>
        <fullName>Initial Submission</fullName>
        <field>Type</field>
        <literalValue>Pending</literalValue>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Not Approved</fullName>
        <field>Type</field>
        <literalValue>Prospect</literalValue>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Type Customer</fullName>
        <field>Type</field>
        <literalValue>Customer</literalValue>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <rules>
        <fullName>annualrevenue</fullName>
        <actions>
            <name>annualrevenue</name>
            <type>Alert</type>
        </actions>
        <active>false</active>
        <formula>AND(OwnerId &lt;&gt; LastModifiedById, AnnualRevenue &gt; 1000000)</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
</Workflow>
