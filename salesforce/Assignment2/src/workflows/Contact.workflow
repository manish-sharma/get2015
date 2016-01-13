<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>birthday notification</fullName>
        <protected>false</protected>
        <recipients>
            <type>accountOwner</type>
        </recipients>
        <template>unfiled$public/birthday</template>
    </alerts>
    <alerts>
        <fullName>experience</fullName>
        <protected>false</protected>
        <recipients>
            <field>Email</field>
            <type>email</type>
        </recipients>
        <template>unfiled$public/experience</template>
    </alerts>
    <rules>
        <fullName>birthday notification</fullName>
        <actions>
            <name>birthday notification</name>
            <type>Alert</type>
        </actions>
        <active>false</active>
        <formula>Birthdate - Today()=2</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>experience</fullName>
        <actions>
            <name>experience</name>
            <type>Alert</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Contact.Experience__c</field>
            <operation>greaterThan</operation>
            <value>5</value>
        </criteriaItems>
        <triggerType>onAllChanges</triggerType>
    </rules>
</Workflow>
