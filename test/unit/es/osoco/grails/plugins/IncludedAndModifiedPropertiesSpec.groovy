package es.osoco.grails.plugins

class IncludedAndModifiedPropertiesSpec extends EqualsHashCodeSpec {

    def createDomainObjectToCompare() {
        new DomainObject(includedProperty: 'included', ignoredProperty: 'ignored')
    }

    def modifiedPropertiesIncludedInEqualsAndHashCode() {
        [includedProperty: 'included changed']
    }

    def modifiedPropertiesIgnoredInEqualsAndHashCode() {
        [ignoredProperty: 'ignored changed']
    }
}
