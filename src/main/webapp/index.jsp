<%-- 
    Document   : index
    Created on : Dec 12, 2017, 7:52:43 PM
    Author     : ghsmith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ESH Viewer</title>
        
        <script src="//ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="//ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
        <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css" />
        <script src="//cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js"></script>

        <script lang="JavaScript">

var rootId = 'd71e8dfe85fa7b59d9bc56cea8d02453';

var searchResultMap = {};

function setNodeSearchState() {
    $($('#treeView').jstree().get_json($('#treeView'), { 'flat' : 'true' })).each(function(index, value) {
        var node = $('#treeView').jstree().get_node(this.id);
        if(this.id in searchResultMap) {
            node.li_attr['style'] = 'font-weight: bold;';
            if($('#searchShowCounts').is(':checked')) {
                $('#treeView').jstree('set_text', node, node.original.text + " (" + searchResultMap[this.id][0] + "<sub>S</sub> " + searchResultMap[this.id][1] + "<sub>C</sub> " + searchResultMap[this.id][2] + "<sub>D</sub> " + searchResultMap[this.id][3] + "<sub>M</sub>)");
            }
            else {
                $('#treeView').jstree('set_text', node, node.original.text);
            }
            $('#treeView').jstree('show_node', node);
        }
        else {
            node.li_attr['style'] = 'font-weight : normal;';
            $('#treeView').jstree('set_text', node, node.original.text);
            $('#treeView').jstree($('#searchPrune').is(':checked') ? 'hide_node' : 'show_node', node);
        }
    });
}

function showEntity(entityName, id) {
    $.ajax({
        'url' : '/eshViewer/webresources/' + entityName + "/" + id,
        'success' : function(result) {
            var html  = '<div style="border: 1px solid black; margin: 5px; background-color: lightgray;">';
            html     += entityName;
            html     += '<pre>' + JSON.stringify(result, null, "\t") + '</pre>';
            html     += '</div>';
            $('#detail').append(html);
            $('#detail').scrollTop($('#detail')[0].scrollHeight - $('#detail')[0].clientHeight);
        }
    });
}

$(document).ready(function() {

    $('#treeView').jstree({
        'core' : {
            'data' : {
                'url' : function(node) {
                    return node.id === '#' ?
                        '/eshViewer/webresources/normalizedHierarchyNode/jsTree' :
                        '/eshViewer/webresources/normalizedHierarchyNode/jsTree' ;
                },
                'data' : function (node) {
                    return node.id === '#' ?
                        { 'parentId' : rootId } :
                        { 'parentId' : node.id } ;
                }
            },
            'themes' : {
                'icons' : false
            }
        }
    });

    $('#searchButton').on('click', function() {
        var searchScopeString = '';
        $('#searchScope:checked').each(function(index, value) {
           searchScopeString += $(value).val();
        });
        $.ajax({
            'url' : '/eshViewer/webresources/normalizedHierarchyNode/searchResult?searchString=' + encodeURIComponent($('#searchText').val()) + '&searchScopeString=' + searchScopeString,
            'success' : function(result) {
                searchResultMap = result;
                setNodeSearchState();
            }
        });
    });

    $('#searchPrune').on('click', function() {
        setNodeSearchState();
    });

    $('#searchShowCounts').on('click', function() {
        setNodeSearchState();
    });

    $('#treeView').on('after_open.jstree', function (node) {
        setNodeSearchState();
    });

    $(document).keypress(function(event) {
        if(event.which == 13) {
            $('#searchButton').trigger('click');
        }
    });

    $('#treeView').on('select_node.jstree', function (node, selected, event) {
        var html  = '<div style="border: 1px solid black; margin: 5px; background-color: yellow;">';
        html     += 'NormalizedHierarchyNode';
        html     += '<pre>' + JSON.stringify(selected.node.original, null, "\t") + '</pre>';
        if(selected.node.original.nodeType === 'event_set') {
            html += 'related:';
            html += '[<a href="javascript:{showEntity(\'V500EventSetCode\', \'' + selected.node.original.cd + '\');}">V500EventSetCode</a>]';
            html += '[<a href="javascript:{showEntity(\'V500EventSetCanon\', \'' + selected.node.original.cd + '.' + selected.node.original.parentCd + '\');}">V500EventSetCanon</a>]';
        }
        else if(selected.node.original.nodeType === 'event_code') {
            html += 'related:';
            html += '[<a href="javascript:{showEntity(\'V500EventCode\', \'' + selected.node.original.cd + '\');}">V500EventCode</a>]';
            html += '[<a href="javascript:{showEntity(\'V500EventSetExplode\', \'' + selected.node.original.cd + '.' + selected.node.original.parentCd + '\');}">V500EventSetExplode</a>]';
        }
        else if(selected.node.original.nodeType === 'discrete_task_assay') {
            html += 'related:';
            html += '[<a href="javascript:{showEntity(\'DiscreteTaskAssay\', \'' + selected.node.original.cd + '\');}">DiscreteTaskAssay</a>]';
            html += '[<a href="javascript:{showEntity(\'CodeValueEventR\', \'' + selected.node.original.cd + '.' + selected.node.original.parentCd + '\');}">CodeValueEventR</a>]';
        }
        else if(selected.node.original.nodeType === 'primary_mnemonic') {
            html += 'related:';
            html += '[<a href="javascript:{showEntity(\'OrderCatalog\', \'' + selected.node.original.cd + '\');}">OrderCatalog</a>]';
        }
        html     += '<br/><br/></div>';
        $('#detail').append(html);
        $('#detail').scrollTop($('#detail')[0].scrollHeight - $('#detail')[0].clientHeight);
    });

});

    </script>

    </head>

    <body style="font-family: monospace;">
        
        <div id="header" style="width: 96%; padding-bottom: 5px;">
            <p style="font-size: small;">
                ESH Viewer build 20171229 (PRD V500 schema replicate 20171115)<br/>
                <a href="http://github.com/ghsmith/eshViewer">http://github.com/ghsmith/eshViewer</a>
            </p>
            Search scope: <input id="searchScope" type="checkbox" value="S" checked="true"/> event_set
                          <input id="searchScope" type="checkbox" value="C" checked="true"/> event_code
                          <input id="searchScope" type="checkbox" value="D" checked="true"/> discrete_task_assay
                          <input id="searchScope" type="checkbox" value="M" checked="true"/> primary_mnemonic<br/>
            Options: <input id="searchShowCounts" type="checkbox" checked="true"/> Show search hit counts
                     <input id="searchPrune" type="checkbox"/> Prune tree branches without search hits<br/>
            <input id="searchText" type="text" size="60"/> <input id="searchButton" type="button" value="Search">
        </div>
        <div id="treeView" style="width: 48%; height: 80vh; border: 1px solid black; display: inline-block; vertical-align: top; overflow-y: auto;"></div>
        <div id="detail" style="width: 48%; height: 80vh; border: 1px solid black; display: inline-block; vertical-align: top; overflow-y: auto;">

<p>
Click on a node in the tree view to see detailed information (JSON format) in
this pane. The hierarchy presented here attempts to generalize the event set
hierarchy and extend it to laboratory discrete task assays and primary [order]
mnemonics. The generalization approach is currently optimized for general lab,
so microbiology and blood bank nodes are not well represented below the level of
the event_code node. The queries run against an unmodified replicate of the V500
schema.
</p>

<p>
Searches currently return nodes where the cd attribute (e.g., <i>11199041</i>)
or the text attribute (e.g., <i>ALLRESLTSECT</i>) contain the search string.
Searches are case-insensitive.
</p>

<p>
Note that this can be a challenging hierarchy to conceptualize because the
cardinality of the parent:child relationship is many:many. For example, the
<i>General Lab</i> event_set node (11199037) has at least 5 different parents.
The generalized hierarchy currently contains about 350,000 nodes. This is
reduced to about 300,000 if primary_mnemonic nodes are not considered (the
inclusion of primary_mnemonic nodes in the hierarchy is contrived, but is
convenient for a first implementation). Many of these nodes are not related to
the laboratory.
</p>

<p>
Legend:
    <ul>
        <li>[S] = event_set node</li>
        <li>[C] = event_code node</li>
        <li>[D] = discrete_task_assay node</li>
        <li>[M] = primary_mnemonic node (order)</li>
        <li>(#) = count of search hits for node (recursively evaluated)</li>
    </ul>
</p>

<p>
To-do:
    <ol>
        <li>Extend generalization to better cover microbiology and blood bank nodes.</li>
        <li>Show more detail information in this pane when a node is clicked.</li>
        <li>Attempt to expose "virtual viewing."</li>
        <li>Consider whether or not primary_mnemonic would be better represented
        as detail attribute.</li>
        <li>Searches are currently unconstrained, which is probably unwise.</li>
        <li>More sophisticated searching modalities (e.g., natural language
        search).</li>
    </ol>
</p>

<pre id="detailJson">
</pre>

        </div>
        
    </body>

</html>
