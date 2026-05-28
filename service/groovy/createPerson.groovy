if (!partyId || !firstName || !lastName) {
    ec.message.addError("partyId, firstName, and lastName are required.")
    return
}

def party = ec.entity.find("learning.party.Party").condition("partyId", partyId).one()
if (party == null) {
    ec.message.addError("Party with ID ${partyId} not found.")
    return
}

def person = ec.entity.makeValue("learning.party.Person")
person.partyId = partyId
person.firstName = firstName
person.lastName = lastName
person.dateOfBirth = dateOfBirth
person.create()

resultMessage = "Person ${firstName} ${lastName} created successfully!"