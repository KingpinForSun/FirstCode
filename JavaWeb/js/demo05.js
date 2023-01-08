window.onload = function () {
    updateZJ();
    //��ҳ�������ɣ�������Ҫ�󶨸����¼�
    //����id��ȡ������
    var fruitTbl = document.getElementById("tbl_fruit");
    //��ȡ�����е����е���
    var rows = fruitTbl.rows;
    for (var i = 1; i < rows.length - 1; i++) {
        var tr = rows[i];
        //1.����������Լ��뿪ʱ���ñ�����ɫ�¼�
        tr.onmouseover = showBGColor;
        tr.onmouseout = clearBGColor;
        //��ȡtr��һ�е����е�Ԫ��
        var cells = tr.cells;
        var priceTD = cells[1];
        //2.����������ڵ��۵�Ԫ������Ƶ��¼�
        priceTD.onmouseover = showHand;
        //3.����������۵�Ԫ����¼�
        priceTD.onclick = editPrice;
    }

}

//����������۵�Ԫ��ʱ���м۸�༭
function editPrice() {
    if (event && event.srcElement && event.srcElement.tagName == "TD") {
        var priceTD = event.srcElement;
        //Ŀ�����жϵ�ǰpriceTD���ӽڵ㣬���ҵ�һ���ӽڵ����ı��ڵ� �� TextNode��Ӧ����3  ElementNode��Ӧ����1
        if (priceTD.firstChild && priceTD.firstChild.nodeType == 3) {
            //innerText ��ʾ���û��߻�ȡ��ǰ�ڵ���ڲ��ı�
            var oldPrice = priceTD.innerText;
            //innerHTML ��ʾ���õ�ǰ�ڵ���ڲ�HTML
            priceTD.innerHTML = "<input type='text' size='4'/>";
            // <td><input type='text' size='4'/></td>
            var input = priceTD.firstChild;
            if (input.tagName == "INPUT") {
                input.value = oldPrice;
                //ѡ��������ڲ����ı�
                input.select();
                //4.�������ʧȥ�����¼� , ʧȥ���㣬���µ���
                input.onblur = updatePrice;
            }
        }

    }
}

function updatePrice() {
    if (event && event.srcElement && event.srcElement.tagName == "INPUT") {
        var input = event.srcElement;
        var newPrice = input.value;
        //input�ڵ�ĸ��ڵ���td
        var priceTD = input.parentElement;
        priceTD.innerText = newPrice;

        //���µ�ǰ�е�С����һ�����ӵ�ֵ
        //priceTD.parentElement td�ĸ�Ԫ����tr
        updateXJ(priceTD.parentElement);

    }
}

//����ָ���е�С��
function updateXJ(tr) {
    if (tr && tr.tagName == "TR") {
        var tds = tr.cells;
        var price = tds[1].innerText;
        var count = tds[2].innerText;
        //innerText��ȡ����ֵ���������ַ������ͣ������Ҫ����ת�������ܽ�����ѧ����
        var xj = parseInt(price) * parseInt(count);
        tds[3].innerText = xj;

        //�����ܼ�
        updateZJ();
    }

}

//�����ܼ�
function updateZJ() {
    var fruitTbl = document.getElementById("tbl_fruit");
    var rows = fruitTbl.rows;
    var sum = 0;
    for (var i = 1; i < rows.length - 1; i++) {
        var tr = rows[i];
        var xj = parseInt(tr.cells[3].innerText);		//NaN    not a number ����һ������
        sum = sum + xj;
    }
    rows[rows.length - 1].cells[1].innerText = sum;
}


//���������ʱ����ʾ������ɫ
function showBGColor() {
    //event : ��ǰ�������¼�
    //event.srcElement : �¼�Դ
    //alert(event.srcElement);
    //alert(event.srcElement.tagName);	--> TD
    if (event && event.srcElement && event.srcElement.tagName == "TD") {
        var td = event.srcElement;
        //td.parentElement ��ʾ��ȡtd�ĸ�Ԫ�� -> TR
        var tr = td.parentElement;
        //�����Ҫͨ��js��������ĳ�ڵ����ʽ������Ҫ���� .style
        tr.style.backgroundColor = "navy";

        //tr.cells��ʾ��ȡ���tr�е����еĵ�Ԫ��
        var tds = tr.cells;
        for (var i = 0; i < tds.length; i++) {
            tds[i].style.color = "white";
        }
    }
}

//������뿪ʱ���ָ�ԭʼ��ʽ
function clearBGColor() {
    if (event && event.srcElement && event.srcElement.tagName == "TD") {
        var td = event.srcElement;
        var tr = td.parentElement;
        tr.style.backgroundColor = "transparent";
        var tds = tr.cells;
        for (var i = 0; i < tds.length; i++) {
            tds[i].style.color = "threeddarkshadow";
        }
    }
}

//����������ڵ��۵�Ԫ��ʱ����ʾ����
function showHand() {
    if (event && event.srcElement && event.srcElement.tagName == "TD") {
        const td = event.srcElement;
        //cursor : ���
        td.style.cursor = "hand";
    }

}