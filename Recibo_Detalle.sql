select  F.TFACTID,
        F.TCCPDET AS CONCEPTO_DE_PAGO, F.TFACTOTAL AS IMPORTE
from detrec F , tdddoc06 R
WHERE F.TFACTID = R.DOCRECFACT AND 
      R.DOCRECFACT = 272896