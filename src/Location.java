public enum Location {

    KERRY,CORK,TIPPERARY, CLARE, WATERFORD, LIMERICK,
    ANTRIM, ARMAGH, CARLOW, CAVAN, DERRY, DONEGAL, DOWN,
    DUBLIN, FERMANAGH, GALWAY, KIlDARE, KILKENNY, LAOIS,
    LEITRIM, LONGFORD, LOUTH, MAYO, MEATH, MONAGHAN,
    OFFALY, ROSCOMMON, SLIGO, TYRONE, WEXFORD, WICKLOW;

    public String toString() {
        switch(this) {
            case ANTRIM:   return "Antrim";
            case ARMAGH:   return "Armagh";
            case CARLOW:   return "Carlow";
            case CAVAN: return "Cavan";
            case CLARE:     return "Clare";
            case CORK:     return "Cork";
            case DERRY:    return "Derry";
            case DONEGAL:     return "Donegal";
            case DOWN:    return "Down";
            case DUBLIN:      return "Dublin";
            case FERMANAGH:      return "Fermanagh";
            case GALWAY:      return "Galway";
            case KIlDARE:   return "Kildare";
            case KILKENNY:    return "Kilkenny";
            case KERRY:     return "Kerry";
            case LAOIS:    return "Laois";
            case LEITRIM:     return "Leitrim";
            case LIMERICK:     return "Limerick";
            case LONGFORD:     return "Longford";
            case LOUTH:     return "Louth";
            case MAYO:     return "Mayo";
            case MEATH:     return "Meath";
            case MONAGHAN:     return "Monaghan";
            case TIPPERARY: return "Tipperary";
            case OFFALY:     return "Offaly";
            case ROSCOMMON:     return "Roscommon";
            case SLIGO:     return "Sligo";
            case TYRONE:     return "Tyrone";
            case WEXFORD:     return "Wexford";
            case WATERFORD:  return "Waterford";
            case WICKLOW:     return "Wicklow";
            default:       return "Invalid Location";
        }
    }
}

