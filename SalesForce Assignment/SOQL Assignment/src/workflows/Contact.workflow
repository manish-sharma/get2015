<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>Welcome_Aboard</fullName>
        <description>Welcome Aboard</description>
        <protected>false</protected>
        <recipients>
            <field>ReportsToId</field>
            <type>contactLookup</type>
        </recipients>
        <recipients>
            <field>Email</field>
            <type>email</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>unfiled$public/Welcome</template>
    </alerts>
    <rules>
        <fullName>Welcome Update</fullName>
        <actions>
            <name>Welcome_Aboard</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>Field_Experience__c &gt; 5</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
</Workflow>
